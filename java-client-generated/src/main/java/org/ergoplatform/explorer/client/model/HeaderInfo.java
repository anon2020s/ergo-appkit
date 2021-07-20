/*
 * Ergo Explorer API v1
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package org.ergoplatform.explorer.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * HeaderInfo
 */


public class HeaderInfo {
  @SerializedName("id")
  private String id = null;

  @SerializedName("parentId")
  private String parentId = null;

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("epoch")
  private Integer epoch = null;

  @SerializedName("difficulty")
  private String difficulty = null;

  @SerializedName("adProofsRoot")
  private String adProofsRoot = null;

  @SerializedName("stateRoot")
  private String stateRoot = null;

  @SerializedName("transactionsRoot")
  private String transactionsRoot = null;

  @SerializedName("timestamp")
  private Long timestamp = null;

  @SerializedName("nBits")
  private Long nBits = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("extensionHash")
  private String extensionHash = null;

  @SerializedName("powSolutions")
  private PowSolutionInfo powSolutions = null;

  @SerializedName("votes")
  private java.util.List<Integer> votes = null;

  public HeaderInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Block/header ID
   * @return id
  **/
  @Schema(required = true, description = "Block/header ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public HeaderInfo parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * ID of the parental block/header
   * @return parentId
  **/
  @Schema(required = true, description = "ID of the parental block/header")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public HeaderInfo version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Version of the header
   * @return version
  **/
  @Schema(required = true, description = "Version of the header")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public HeaderInfo height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Block/header height
   * @return height
  **/
  @Schema(required = true, description = "Block/header height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public HeaderInfo epoch(Integer epoch) {
    this.epoch = epoch;
    return this;
  }

   /**
   * Block/header epoch (Epochs are enumerated from 0)
   * @return epoch
  **/
  @Schema(required = true, description = "Block/header epoch (Epochs are enumerated from 0)")
  public Integer getEpoch() {
    return epoch;
  }

  public void setEpoch(Integer epoch) {
    this.epoch = epoch;
  }

  public HeaderInfo difficulty(String difficulty) {
    this.difficulty = difficulty;
    return this;
  }

   /**
   * Block/header difficulty
   * @return difficulty
  **/
  @Schema(required = true, description = "Block/header difficulty")
  public String getDifficulty() {
    return difficulty;
  }

  public void setDifficulty(String difficulty) {
    this.difficulty = difficulty;
  }

  public HeaderInfo adProofsRoot(String adProofsRoot) {
    this.adProofsRoot = adProofsRoot;
    return this;
  }

   /**
   * Hex-encoded root of the corresponding AD proofs
   * @return adProofsRoot
  **/
  @Schema(required = true, description = "Hex-encoded root of the corresponding AD proofs")
  public String getAdProofsRoot() {
    return adProofsRoot;
  }

  public void setAdProofsRoot(String adProofsRoot) {
    this.adProofsRoot = adProofsRoot;
  }

  public HeaderInfo stateRoot(String stateRoot) {
    this.stateRoot = stateRoot;
    return this;
  }

   /**
   * Hex-encoded root of the corresponding state
   * @return stateRoot
  **/
  @Schema(required = true, description = "Hex-encoded root of the corresponding state")
  public String getStateRoot() {
    return stateRoot;
  }

  public void setStateRoot(String stateRoot) {
    this.stateRoot = stateRoot;
  }

  public HeaderInfo transactionsRoot(String transactionsRoot) {
    this.transactionsRoot = transactionsRoot;
    return this;
  }

   /**
   * Hex-encoded root of the corresponding transactions
   * @return transactionsRoot
  **/
  @Schema(required = true, description = "Hex-encoded root of the corresponding transactions")
  public String getTransactionsRoot() {
    return transactionsRoot;
  }

  public void setTransactionsRoot(String transactionsRoot) {
    this.transactionsRoot = transactionsRoot;
  }

  public HeaderInfo timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp the block/header was created
   * @return timestamp
  **/
  @Schema(required = true, description = "Timestamp the block/header was created")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public HeaderInfo nBits(Long nBits) {
    this.nBits = nBits;
    return this;
  }

   /**
   * Encoded required difficulty
   * @return nBits
  **/
  @Schema(required = true, description = "Encoded required difficulty")
  public Long getNBits() {
    return nBits;
  }

  public void setNBits(Long nBits) {
    this.nBits = nBits;
  }

  public HeaderInfo size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Size of the header in bytes
   * @return size
  **/
  @Schema(required = true, description = "Size of the header in bytes")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public HeaderInfo extensionHash(String extensionHash) {
    this.extensionHash = extensionHash;
    return this;
  }

   /**
   * Hex-encoded hash of the corresponding extension
   * @return extensionHash
  **/
  @Schema(required = true, description = "Hex-encoded hash of the corresponding extension")
  public String getExtensionHash() {
    return extensionHash;
  }

  public void setExtensionHash(String extensionHash) {
    this.extensionHash = extensionHash;
  }

  public HeaderInfo powSolutions(PowSolutionInfo powSolutions) {
    this.powSolutions = powSolutions;
    return this;
  }

   /**
   * Get powSolutions
   * @return powSolutions
  **/
  @Schema(required = true, description = "")
  public PowSolutionInfo getPowSolutions() {
    return powSolutions;
  }

  public void setPowSolutions(PowSolutionInfo powSolutions) {
    this.powSolutions = powSolutions;
  }

  public HeaderInfo votes(java.util.List<Integer> votes) {
    this.votes = votes;
    return this;
  }

   /**
   * Get votes
   * @return votes
  **/
  @Schema(required = true, description = "")
  public java.util.List<Integer> getVotes() {
    return votes;
  }

  public void setVotes(java.util.List<Integer> votes) {
    this.votes = votes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaderInfo headerInfo = (HeaderInfo) o;
    return Objects.equals(this.id, headerInfo.id) &&
        Objects.equals(this.parentId, headerInfo.parentId) &&
        Objects.equals(this.version, headerInfo.version) &&
        Objects.equals(this.height, headerInfo.height) &&
        Objects.equals(this.epoch, headerInfo.epoch) &&
        Objects.equals(this.difficulty, headerInfo.difficulty) &&
        Objects.equals(this.adProofsRoot, headerInfo.adProofsRoot) &&
        Objects.equals(this.stateRoot, headerInfo.stateRoot) &&
        Objects.equals(this.transactionsRoot, headerInfo.transactionsRoot) &&
        Objects.equals(this.timestamp, headerInfo.timestamp) &&
        Objects.equals(this.nBits, headerInfo.nBits) &&
        Objects.equals(this.size, headerInfo.size) &&
        Objects.equals(this.extensionHash, headerInfo.extensionHash) &&
        Objects.equals(this.powSolutions, headerInfo.powSolutions) &&
        Objects.equals(this.votes, headerInfo.votes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, version, height, epoch, difficulty, adProofsRoot, stateRoot, transactionsRoot, timestamp, nBits, size, extensionHash, powSolutions, votes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    epoch: ").append(toIndentedString(epoch)).append("\n");
    sb.append("    difficulty: ").append(toIndentedString(difficulty)).append("\n");
    sb.append("    adProofsRoot: ").append(toIndentedString(adProofsRoot)).append("\n");
    sb.append("    stateRoot: ").append(toIndentedString(stateRoot)).append("\n");
    sb.append("    transactionsRoot: ").append(toIndentedString(transactionsRoot)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    nBits: ").append(toIndentedString(nBits)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    extensionHash: ").append(toIndentedString(extensionHash)).append("\n");
    sb.append("    powSolutions: ").append(toIndentedString(powSolutions)).append("\n");
    sb.append("    votes: ").append(toIndentedString(votes)).append("\n");
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