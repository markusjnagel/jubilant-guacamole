package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Etuusasian tila
 */
@ApiModel(description = "Etuusasian tila")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-08-10T22:12:39.436355+02:00[Europe/Berlin]")
public class Etuusasia   {
  /**
   * Tilan koodi
   */
  public enum TilaEnum {
    _40("40"),
    
    _50("50");

    private String value;

    TilaEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TilaEnum fromValue(String value) {
      for (TilaEnum b : TilaEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("tila")
  private TilaEnum tila;

  @JsonProperty("ratkaisuTyyppi")
  private String ratkaisuTyyppi;

  @JsonProperty("etuus")
  private String etuus;

  @JsonProperty("asiakasId")
  private UUID asiakasId;

  @JsonProperty("ratkaisupvm")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE)
  private LocalDate ratkaisupvm;

  public Etuusasia tila(TilaEnum tila) {
    this.tila = tila;
    return this;
  }

  /**
   * Tilan koodi
   * @return tila
  */
  @ApiModelProperty(value = "Tilan koodi")


  public TilaEnum getTila() {
    return tila;
  }

  public void setTila(TilaEnum tila) {
    this.tila = tila;
  }

  public Etuusasia ratkaisuTyyppi(String ratkaisuTyyppi) {
    this.ratkaisuTyyppi = ratkaisuTyyppi;
    return this;
  }

  /**
   * Ratkaisun tyypin koodi
   * @return ratkaisuTyyppi
  */
  @ApiModelProperty(value = "Ratkaisun tyypin koodi")


  public String getRatkaisuTyyppi() {
    return ratkaisuTyyppi;
  }

  public void setRatkaisuTyyppi(String ratkaisuTyyppi) {
    this.ratkaisuTyyppi = ratkaisuTyyppi;
  }

  public Etuusasia etuus(String etuus) {
    this.etuus = etuus;
    return this;
  }

  /**
   * Etuus
   * @return etuus
  */
  @ApiModelProperty(value = "Etuus")


  public String getEtuus() {
    return etuus;
  }

  public void setEtuus(String etuus) {
    this.etuus = etuus;
  }

  public Etuusasia asiakasId(UUID asiakasId) {
    this.asiakasId = asiakasId;
    return this;
  }

  /**
   * AsiakasID
   * @return asiakasId
  */
  @ApiModelProperty(value = "AsiakasID")

  @Valid

  public UUID getAsiakasId() {
    return asiakasId;
  }

  public void setAsiakasId(UUID asiakasId) {
    this.asiakasId = asiakasId;
  }

  public Etuusasia ratkaisupvm(LocalDate ratkaisupvm) {
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
    Etuusasia etuusasia = (Etuusasia) o;
    return Objects.equals(this.tila, etuusasia.tila) &&
        Objects.equals(this.ratkaisuTyyppi, etuusasia.ratkaisuTyyppi) &&
        Objects.equals(this.etuus, etuusasia.etuus) &&
        Objects.equals(this.asiakasId, etuusasia.asiakasId) &&
        Objects.equals(this.ratkaisupvm, etuusasia.ratkaisupvm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tila, ratkaisuTyyppi, etuus, asiakasId, ratkaisupvm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Etuusasia {\n");
    
    sb.append("    tila: ").append(toIndentedString(tila)).append("\n");
    sb.append("    ratkaisuTyyppi: ").append(toIndentedString(ratkaisuTyyppi)).append("\n");
    sb.append("    etuus: ").append(toIndentedString(etuus)).append("\n");
    sb.append("    asiakasId: ").append(toIndentedString(asiakasId)).append("\n");
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

