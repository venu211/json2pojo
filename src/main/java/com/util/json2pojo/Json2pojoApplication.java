package com.util.json2pojo;

import com.sun.codemodel.JCodeModel;
import org.jsonschema2pojo.*;
import org.jsonschema2pojo.rules.RuleFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.net.URL;

@SpringBootApplication
public class Json2pojoApplication {

	public static void main(String[] args) {

		//SpringApplication.run(Json2pojoApplication.class, args);
		String packageName="pojo";
		File inputJson= new File("./src/main/java/com/util/json2pojo/input.json");
		File outputPojoDirectory=new File("./src/main/java/com/util/json2pojo/model");
		outputPojoDirectory.mkdirs();
		try {
			new Json2pojoApplication().convert2JSON(inputJson.toURI().toURL(), outputPojoDirectory, packageName, inputJson.getName().replace(".json", ""));
		} catch (IOException e) {
			System.out.println("Encountered issue while converting to pojo: "+e.getMessage());
			e.printStackTrace();
		}
	}

	public void convert2JSON(URL inputJson, File outputPojoDirectory, String packageName, String className) throws IOException{
		JCodeModel codeModel = new JCodeModel();
		URL source = inputJson;
		GenerationConfig config = new DefaultGenerationConfig() {
			@Override
			public boolean isGenerateBuilders() { // set config option by overriding method
				return true;
			}
			public SourceType getSourceType(){
				return SourceType.JSON;
			}
		};
		SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
		mapper.generate(codeModel, className, packageName, source);
		codeModel.build(outputPojoDirectory);
	}

}


