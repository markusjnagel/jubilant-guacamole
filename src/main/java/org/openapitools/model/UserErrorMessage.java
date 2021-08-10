package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserErrorMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-10T22:12:39.436355+02:00[Europe/Berlin]")
public class UserErrorMessage   {
  @JsonProperty("message")
  private String message;

  @JsonProperty("fieldReference")
  private String fieldReference;

  @JsonProperty("objectReference")
  private String objectReference;

  public UserErrorMessage message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Virheviesti joka voidaan näyttää käyttäjälle
   * @return message
  */
  @ApiModelProperty(required = true, value = "Virheviesti joka voidaan näyttää käyttäjälle")
  @NotNull


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public UserErrorMessage fieldReference(String fieldReference) {
    this.fieldReference = fieldReference;
    return this;
  }

  /**
   * Viittaus kenttään, johon virhe liittyy. Yleensä tässä on pyyntösanoman kenttä, johon virhe liittyy, esim. 'asia.vireilletulo.vireilletulopaiva'
   * @return fieldReference
  */
  @ApiModelProperty(value = "Viittaus kenttään, johon virhe liittyy. Yleensä tässä on pyyntösanoman kenttä, johon virhe liittyy, esim. 'asia.vireilletulo.vireilletulopaiva'")


  public String getFieldReference() {
    return fieldReference;
  }

  public void setFieldReference(String fieldReference) {
    this.fieldReference = fieldReference;
  }

  public UserErrorMessage objectReference(String objectReference) {
    this.objectReference = objectReference;
    return this;
  }

  /**
   * Viittaus olioon, johon virhe liittyy. Silloin kun fieldReference viittaa taulukkoon, voidaan tarvita viite siihen, mihin taulukon alkioon virhe liittyy. Silloin tässä kentässä voidaan välittää alkion indeksi tai id.
   * @return objectReference
  */
  @ApiModelProperty(value = "Viittaus olioon, johon virhe liittyy. Silloin kun fieldReference viittaa taulukkoon, voidaan tarvita viite siihen, mihin taulukon alkioon virhe liittyy. Silloin tässä kentässä voidaan välittää alkion indeksi tai id.")


  public String getObjectReference() {
    return objectReference;
  }

  public void setObjectReference(String objectReference) {
    this.objectReference = objectReference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserErrorMessage userErrorMessage = (UserErrorMessage) o;
    return Objects.equals(this.message, userErrorMessage.message) &&
        Objects.equals(this.fieldReference, userErrorMessage.fieldReference) &&
        Objects.equals(this.objectReference, userErrorMessage.objectReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, fieldReference, objectReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserErrorMessage {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    fieldReference: ").append(toIndentedString(fieldReference)).append("\n");
    sb.append("    objectReference: ").append(toIndentedString(objectReference)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

