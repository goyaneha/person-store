import java.io.Serializable;
import java.util.HashMap;
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
"firstName",
"lastName",
"age",
"favourite_colour"
})
public class PersonData implements Serializable
{

@JsonProperty("firstName")
private String firstName;
@JsonProperty("lastName")
private String lastName;
@JsonProperty("age")
private Integer age;
@JsonProperty("favourite_colour")
private String favouriteColour;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = -4924080967825092277L;

@JsonProperty("firstName")
public String getFirstName() {
return firstName;
}

@JsonProperty("firstName")
public void setFirstName(String firstName) {
this.firstName = firstName;
}

@JsonProperty("lastName")
public String getLastName() {
return lastName;
}

@JsonProperty("lastName")
public void setLastName(String lastName) {
this.lastName = lastName;
}

@JsonProperty("age")
public Integer getAge() {
return age;
}

@JsonProperty("age")
public void setAge(Integer age) {
this.age = age;
}

@JsonProperty("favourite_colour")
public String getFavouriteColour() {
return favouriteColour;
}

@JsonProperty("favourite_colour")
public void setFavouriteColour(String favouriteColour) {
this.favouriteColour = favouriteColour;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

@Override
public String toString() {
return new ToStringBuilder(this).append("firstName", firstName).append("lastName", lastName).append("age", age).append("favouriteColour", favouriteColour).append("additionalProperties", additionalProperties).toString();
}

@Override
public int hashCode() {
return new HashCodeBuilder().append(firstName).append(lastName).append(favouriteColour).append(additionalProperties).append(age).toHashCode();
}

@Override
public boolean equals(Object other) {
if (other == this) {
return true;
}
if ((other instanceof PersonData) == false) {
return false;
}
PersonData rhs = ((PersonData) other);
return new EqualsBuilder().append(firstName, rhs.firstName).append(lastName, rhs.lastName).append(favouriteColour, rhs.favouriteColour).append(additionalProperties, rhs.additionalProperties).append(age, rhs.age).isEquals();
}

}
