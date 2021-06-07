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
/**
 * BlockHeaderWithoutPow
 */


public class BlockHeaderWithoutPow {
  @SerializedName("id")
  private String id = null;

  @SerializedName("timestamp")
  private Integer timestamp = null;

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("adProofsRoot")
  private String adProofsRoot = null;

  @SerializedName("stateRoot")
  private String stateRoot = null;

  @SerializedName("transactionsRoot")
  private String transactionsRoot = null;

  @SerializedName("nBits")
  private Long nBits = null;

  @SerializedName("extensionHash")
  private String extensionHash = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("difficulty")
  private Integer difficulty = null;

  @SerializedName("parentId")
  private String parentId = null;

  @SerializedName("votes")
  private String votes = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("extensionId")
  private String extensionId = null;

  @SerializedName("transactionsId")
  private String transactionsId = null;

  @SerializedName("adProofsId")
  private String adProofsId = null;

  public BlockHeaderWithoutPow id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BlockHeaderWithoutPow timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @Schema(required = true, description = "")
  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  public BlockHeaderWithoutPow version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(required = true, description = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public BlockHeaderWithoutPow adProofsRoot(String adProofsRoot) {
    this.adProofsRoot = adProofsRoot;
    return this;
  }

   /**
   * Get adProofsRoot
   * @return adProofsRoot
  **/
  @Schema(required = true, description = "")
  public String getAdProofsRoot() {
    return adProofsRoot;
  }

  public void setAdProofsRoot(String adProofsRoot) {
    this.adProofsRoot = adProofsRoot;
  }

  public BlockHeaderWithoutPow stateRoot(String stateRoot) {
    this.stateRoot = stateRoot;
    return this;
  }

   /**
   * Get stateRoot
   * @return stateRoot
  **/
  @Schema(required = true, description = "")
  public String getStateRoot() {
    return stateRoot;
  }

  public void setStateRoot(String stateRoot) {
    this.stateRoot = stateRoot;
  }

  public BlockHeaderWithoutPow transactionsRoot(String transactionsRoot) {
    this.transactionsRoot = transactionsRoot;
    return this;
  }

   /**
   * Get transactionsRoot
   * @return transactionsRoot
  **/
  @Schema(required = true, description = "")
  public String getTransactionsRoot() {
    return transactionsRoot;
  }

  public void setTransactionsRoot(String transactionsRoot) {
    this.transactionsRoot = transactionsRoot;
  }

  public BlockHeaderWithoutPow nBits(Long nBits) {
    this.nBits = nBits;
    return this;
  }

   /**
   * Get nBits
   * minimum: 0
   * @return nBits
  **/
  @Schema(example = "19857408", required = true, description = "")
  public Long getNBits() {
    return nBits;
  }

  public void setNBits(Long nBits) {
    this.nBits = nBits;
  }

  public BlockHeaderWithoutPow extensionHash(String extensionHash) {
    this.extensionHash = extensionHash;
    return this;
  }

   /**
   * Get extensionHash
   * @return extensionHash
  **/
  @Schema(required = true, description = "")
  public String getExtensionHash() {
    return extensionHash;
  }

  public void setExtensionHash(String extensionHash) {
    this.extensionHash = extensionHash;
  }

  public BlockHeaderWithoutPow height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * minimum: 0
   * @return height
  **/
  @Schema(example = "667", required = true, description = "")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public BlockHeaderWithoutPow difficulty(Integer difficulty) {
    this.difficulty = difficulty;
    return this;
  }

   /**
   * Get difficulty
   * minimum: 0
   * @return difficulty
  **/
  @Schema(example = "62", required = true, description = "")
  public Integer getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(Integer difficulty) {
    this.difficulty = difficulty;
  }

  public BlockHeaderWithoutPow parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @Schema(required = true, description = "")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public BlockHeaderWithoutPow votes(String votes) {
    this.votes = votes;
    return this;
  }

   /**
   * Get votes
   * @return votes
  **/
  @Schema(required = true, description = "")
  public String getVotes() {
    return votes;
  }

  public void setVotes(String votes) {
    this.votes = votes;
  }

  public BlockHeaderWithoutPow size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Size in bytes
   * @return size
  **/
  @Schema(description = "Size in bytes")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public BlockHeaderWithoutPow extensionId(String extensionId) {
    this.extensionId = extensionId;
    return this;
  }

   /**
   * Get extensionId
   * @return extensionId
  **/
  @Schema(description = "")
  public String getExtensionId() {
    return extensionId;
  }

  public void setExtensionId(String extensionId) {
    this.extensionId = extensionId;
  }

  public BlockHeaderWithoutPow transactionsId(String transactionsId) {
    this.transactionsId = transactionsId;
    return this;
  }

   /**
   * Get transactionsId
   * @return transactionsId
  **/
  @Schema(description = "")
  public String getTransactionsId() {
    return transactionsId;
  }

  public void setTransactionsId(String transactionsId) {
    this.transactionsId = transactionsId;
  }

  public BlockHeaderWithoutPow adProofsId(String adProofsId) {
    this.adProofsId = adProofsId;
    return this;
  }

   /**
   * Get adProofsId
   * @return adProofsId
  **/
  @Schema(description = "")
  public String getAdProofsId() {
    return adProofsId;
  }

  public void setAdProofsId(String adProofsId) {
    this.adProofsId = adProofsId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockHeaderWithoutPow blockHeaderWithoutPow = (BlockHeaderWithoutPow) o;
    return Objects.equals(this.id, blockHeaderWithoutPow.id) &&
        Objects.equals(this.timestamp, blockHeaderWithoutPow.timestamp) &&
        Objects.equals(this.version, blockHeaderWithoutPow.version) &&
        Objects.equals(this.adProofsRoot, blockHeaderWithoutPow.adProofsRoot) &&
        Objects.equals(this.stateRoot, blockHeaderWithoutPow.stateRoot) &&
        Objects.equals(this.transactionsRoot, blockHeaderWithoutPow.transactionsRoot) &&
        Objects.equals(this.nBits, blockHeaderWithoutPow.nBits) &&
        Objects.equals(this.extensionHash, blockHeaderWithoutPow.extensionHash) &&
        Objects.equals(this.height, blockHeaderWithoutPow.height) &&
        Objects.equals(this.difficulty, blockHeaderWithoutPow.difficulty) &&
        Objects.equals(this.parentId, blockHeaderWithoutPow.parentId) &&
        Objects.equals(this.votes, blockHeaderWithoutPow.votes) &&
        Objects.equals(this.size, blockHeaderWithoutPow.size) &&
        Objects.equals(this.extensionId, blockHeaderWithoutPow.extensionId) &&
        Objects.equals(this.transactionsId, blockHeaderWithoutPow.transactionsId) &&
        Objects.equals(this.adProofsId, blockHeaderWithoutPow.adProofsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timestamp, version, adProofsRoot, stateRoot, transactionsRoot, nBits, extensionHash, height, difficulty, parentId, votes, size, extensionId, transactionsId, adProofsId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockHeaderWithoutPow {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    adProofsRoot: ").append(toIndentedString(adProofsRoot)).append("\n");
    sb.append("    stateRoot: ").append(toIndentedString(stateRoot)).append("\n");
    sb.append("    transactionsRoot: ").append(toIndentedString(transactionsRoot)).append("\n");
    sb.append("    nBits: ").append(toIndentedString(nBits)).append("\n");
    sb.append("    extensionHash: ").append(toIndentedString(extensionHash)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    votes: ").append(toIndentedString(votes)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    extensionId: ").append(toIndentedString(extensionId)).append("\n");
    sb.append("    transactionsId: ").append(toIndentedString(transactionsId)).append("\n");
    sb.append("    adProofsId: ").append(toIndentedString(adProofsId)).append("\n");
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
