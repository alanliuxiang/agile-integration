
package notice;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "phone",
    "vechicle",
    "occupience"
})
public class Notice {

    @JsonProperty("name")
    private String name;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("vechicle")
    private int vechicle;
    @JsonProperty("occupience")
    private int occupience;

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The phone
     */
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    /**
     * 
     * @param phone
     *     The phone
     */
    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 
     * @return
     *     The vechicle
     */
    @JsonProperty("vechicle")
    public int getVechicle() {
        return vechicle;
    }

    /**
     * 
     * @param vechicle
     *     The vechicle
     */
    @JsonProperty("vechicle")
    public void setVechicle(int vechicle) {
        this.vechicle = vechicle;
    }

    /**
     * 
     * @return
     *     The occupience
     */
    @JsonProperty("occupience")
    public int getOccupience() {
        return occupience;
    }

    /**
     * 
     * @param occupience
     *     The occupience
     */
    @JsonProperty("occupience")
    public void setOccupience(int occupience) {
        this.occupience = occupience;
    }

}
