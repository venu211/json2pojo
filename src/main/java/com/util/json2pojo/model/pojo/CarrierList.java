
package pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "carrier",
    "manufracturerList"
})
public class CarrierList {

    @JsonProperty("carrier")
    private String carrier;
    @JsonProperty("manufracturerList")
    private List<ManufracturerList> manufracturerList = new ArrayList<ManufracturerList>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("carrier")
    public String getCarrier() {
        return carrier;
    }

    @JsonProperty("carrier")
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public CarrierList withCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }

    @JsonProperty("manufracturerList")
    public List<ManufracturerList> getManufracturerList() {
        return manufracturerList;
    }

    @JsonProperty("manufracturerList")
    public void setManufracturerList(List<ManufracturerList> manufracturerList) {
        this.manufracturerList = manufracturerList;
    }

    public CarrierList withManufracturerList(List<ManufracturerList> manufracturerList) {
        this.manufracturerList = manufracturerList;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public CarrierList withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(carrier).append(manufracturerList).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CarrierList) == false) {
            return false;
        }
        CarrierList rhs = ((CarrierList) other);
        return new EqualsBuilder().append(carrier, rhs.carrier).append(manufracturerList, rhs.manufracturerList).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
