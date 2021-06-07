/*
 * Ergo Node API
 * API docs for Ergo Node. Models are shared between all Ergo products
 *
 * OpenAPI spec version: 4.0.12
 * Contact: ergoplatform@protonmail.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.ergoplatform.restapi.client;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.ergoplatform.restapi.client.InputHints;
/**
 * prover hints extracted from a transaction
 */
@Schema(description = "prover hints extracted from a transaction")

public class TransactionHintsBag {
  @SerializedName("secretHints")
  private java.util.List<InputHints> secretHints = null;

  @SerializedName("publicHints")
  private java.util.List<InputHints> publicHints = null;

  public TransactionHintsBag secretHints(java.util.List<InputHints> secretHints) {
    this.secretHints = secretHints;
    return this;
  }

  public TransactionHintsBag addSecretHintsItem(InputHints secretHintsItem) {
    if (this.secretHints == null) {
      this.secretHints = new java.util.ArrayList<InputHints>();
    }
    this.secretHints.add(secretHintsItem);
    return this;
  }

   /**
   * Hints which contain secrets, do not share them!
   * @return secretHints
  **/
  @Schema(description = "Hints which contain secrets, do not share them!")
  public java.util.List<InputHints> getSecretHints() {
    return secretHints;
  }

  public void setSecretHints(java.util.List<InputHints> secretHints) {
    this.secretHints = secretHints;
  }

  public TransactionHintsBag publicHints(java.util.List<InputHints> publicHints) {
    this.publicHints = publicHints;
    return this;
  }

  public TransactionHintsBag addPublicHintsItem(InputHints publicHintsItem) {
    if (this.publicHints == null) {
      this.publicHints = new java.util.ArrayList<InputHints>();
    }
    this.publicHints.add(publicHintsItem);
    return this;
  }

   /**
   * Hints which contain public data only, share them freely!
   * @return publicHints
  **/
  @Schema(description = "Hints which contain public data only, share them freely!")
  public java.util.List<InputHints> getPublicHints() {
    return publicHints;
  }

  public void setPublicHints(java.util.List<InputHints> publicHints) {
    this.publicHints = publicHints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionHintsBag transactionHintsBag = (TransactionHintsBag) o;
    return Objects.equals(this.secretHints, transactionHintsBag.secretHints) &&
        Objects.equals(this.publicHints, transactionHintsBag.publicHints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secretHints, publicHints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionHintsBag {\n");
    
    sb.append("    secretHints: ").append(toIndentedString(secretHints)).append("\n");
    sb.append("    publicHints: ").append(toIndentedString(publicHints)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
