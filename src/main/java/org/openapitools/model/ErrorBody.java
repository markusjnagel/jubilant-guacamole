package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.UserErrorMessage;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Virhetilanteissa palautettava sanoma. Sanoma sisältää aina teknisen virheviestin. Lisäksi se voi sisältää yhden tai useita viestejä, joita voidaan näyttää käyttäjälle.
 */
@ApiModel(description = "Virhetilanteissa palautettava sanoma. Sanoma sisältää aina teknisen virheviestin. Lisäksi se voi sisältää yhden tai useita viestejä, joita voidaan näyttää käyttäjälle.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-10T22:12:39.436355+02:00[Europe/Berlin]")
public class ErrorBody   {
  @JsonProperty("errorcode")
  private String errorcode;

  @JsonProperty("systemErrorMessage")
  private String systemErrorMessage;

  @JsonProperty("userErrorMessages")
  @Valid
  private List<UserErrorMessage> userErrorMessages = new ArrayList<>();

  public ErrorBody errorcode(String errorcode) {
    this.errorcode = errorcode;
    return this;
  }

  /**
   * Get errorcode
   * @return errorcode
  */
  @ApiModelProperty(value = "")


  public String getErrorcode() {
    return errorcode;
  }

  public void setErrorcode(String errorcode) {
    this.errorcode = errorcode;
  }

  public ErrorBody systemErrorMessage(String systemErrorMessage) {
    this.systemErrorMessage = systemErrorMessage;
    return this;
  }

  /**
   * Tekninen virheviesti. Viesti voidaan kirjoittaa lokille, mutta sitä ei pidä näyttää käyttäjälle.
   * @return systemErrorMessage
  */
  @ApiModelProperty(required = true, value = "Tekninen virheviesti. Viesti voidaan kirjoittaa lokille, mutta sitä ei pidä näyttää käyttäjälle.")
  @NotNull


  public String getSystemErrorMessage() {
    return systemErrorMessage;
  }

  public void setSystemErrorMessage(String systemErrorMessage) {
    this.systemErrorMessage = systemErrorMessage;
  }

  public ErrorBody userErrorMessages(List<UserErrorMessage> userErrorMessages) {
    this.userErrorMessages = userErrorMessages;
    return this;
  }

  public ErrorBody addUserErrorMessagesItem(UserErrorMessage userErrorMessagesItem) {
    this.userErrorMessages.add(userErrorMessagesItem);
    return this;
  }

  /**
   * Virheviestit joita voidaan näyttää käyttäjälle
   * @return userErrorMessages
  */
  @ApiModelProperty(required = true, value = "Virheviestit joita voidaan näyttää käyttäjälle")
  @NotNull

  @Valid

  public List<UserErrorMessage> getUserErrorMessages() {
    return userErrorMessages;
  }

  public void setUserErrorMessages(List<UserErrorMessage> userErrorMessages) {
    this.userErrorMessages = userErrorMessages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorBody errorBody = (ErrorBody) o;
    return Objects.equals(this.errorcode, errorBody.errorcode) &&
        Objects.equals(this.systemErrorMessage, errorBody.systemErrorMessage) &&
        Objects.equals(this.userErrorMessages, errorBody.userErrorMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorcode, systemErrorMessage, userErrorMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorBody {\n");
    
    sb.append("    errorcode: ").append(toIndentedString(errorcode)).append("\n");
    sb.append("    systemErrorMessage: ").append(toIndentedString(systemErrorMessage)).append("\n");
    sb.append("    userErrorMessages: ").append(toIndentedString(userErrorMessages)).append("\n");
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

