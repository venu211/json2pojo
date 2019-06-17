
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
    "manufracturer",
    "deviceList"
})
public class ManufracturerList {

    @JsonProperty("manufracturer")
    private String manufracturer;
    @JsonProperty("deviceList")
    private List<DeviceList> deviceList = new ArrayList<DeviceList>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("manufracturer")
    public String getManufracturer() {
        return manufracturer;
    }

    @JsonProperty("manufracturer")
    public void setManufracturer(String manufracturer) {
        this.manufracturer = manufracturer;
    }

    public ManufracturerList withManufracturer(String manufracturer) {
        this.manufracturer = manufracturer;
        return this;
    }

    @JsonProperty("deviceList")
    public List<DeviceList> getDeviceList() {
        return deviceList;
    }

    @JsonProperty("deviceList")
    public void setDeviceList(List<DeviceList> deviceList) {
        this.deviceList = deviceList;
    }

    public ManufracturerList withDeviceList(List<DeviceList> deviceList) {
        this.deviceList = deviceList;
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

    public ManufracturerList withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(manufracturer).append(deviceList).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ManufracturerList) == false) {
            return false;
        }
        ManufracturerList rhs = ((ManufracturerList) other);
        return new EqualsBuilder().append(manufracturer, rhs.manufracturer).append(deviceList, rhs.deviceList).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
