package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Asumistuen varmistus
 */
@ApiModel(description = "Asumistuen varmistus")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-10T22:12:39.436355+02:00[Europe/Berlin]")
public class Varmistus   {
  @JsonProperty("ratkaisija")
  private String ratkaisija;

  @JsonProperty("ratkaisupvm")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate ratkaisupvm;

  public Varmistus ratkaisija(String ratkaisija) {
    this.ratkaisija = ratkaisija;
    return this;
  }

  /**
   * Ratkaisija
   * @return ratkaisija
  */
  @ApiModelProperty(value = "Ratkaisija")


  public String getRatkaisija() {
    return ratkaisija;
  }

  public void setRatkaisija(String ratkaisija) {
    this.ratkaisija = ratkaisija;
  }

  public Varmistus ratkaisupvm(LocalDate ratkaisupvm) {
    this.ratkaisupvm = ratkaisupvm;
    return this;
  }

  /**
   * Ratkaisun päivämäärä
   * @return ratkaisupvm
  */
  @ApiModelProperty(value = "Ratkaisun päivämäärä")

  @Valid

  public LocalDate getRatkaisupvm() {
    return ratkaisupvm;
  }

  public void setRatkaisupvm(LocalDate ratkaisupvm) {
    this.ratkaisupvm = ratkaisupvm;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Varmistus varmistus = (Varmistus) o;
    return Objects.equals(this.ratkaisija, varmistus.ratkaisija) &&
        Objects.equals(this.ratkaisupvm, varmistus.ratkaisupvm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratkaisija, ratkaisupvm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Varmistus {\n");
    
    sb.append("    ratkaisija: ").append(toIndentedString(ratkaisija)).append("\n");
    sb.append("    ratkaisupvm: ").append(toIndentedString(ratkaisupvm)).append("\n");
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

