
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
    "device",
    "capacityList"
})
public class DeviceList {

    @JsonProperty("device")
    private String device;
    @JsonProperty("capacityList")
    private List<CapacityList> capacityList = new ArrayList<CapacityList>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("device")
    public String getDevice() {
        return device;
    }

    @JsonProperty("device")
    public void setDevice(String device) {
        this.device = device;
    }

    public DeviceList withDevice(String device) {
        this.device = device;
        return this;
    }

    @JsonProperty("capacityList")
    public List<CapacityList> getCapacityList() {
        return capacityList;
    }

    @JsonProperty("capacityList")
    public void setCapacityList(List<CapacityList> capacityList) {
        this.capacityList = capacityList;
    }

    public DeviceList withCapacityList(List<CapacityList> capacityList) {
        this.capacityList = capacityList;
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

    public DeviceList withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(device).append(capacityList).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeviceList) == false) {
            return false;
        }
        DeviceList rhs = ((DeviceList) other);
        return new EqualsBuilder().append(device, rhs.device).append(capacityList, rhs.capacityList).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
