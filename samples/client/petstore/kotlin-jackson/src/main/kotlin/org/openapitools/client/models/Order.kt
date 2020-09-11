/**
* OpenAPI Petstore
* This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import com.fasterxml.jackson.annotation.JsonProperty

/**
 * An order for a pets from the pet store
 * @param id 
 * @param petId 
 * @param quantity 
 * @param shipDate 
 * @param status Order Status
 * @param complete 
 */

data class Order (
    @field:JsonProperty("id")
    val id: kotlin.Long? = null,
    @field:JsonProperty("petId")
    val petId: kotlin.Long? = null,
    @field:JsonProperty("quantity")
    val quantity: kotlin.Int? = null,
    @field:JsonProperty("shipDate")
    val shipDate: java.time.OffsetDateTime? = null,
    /* Order Status */
    @field:JsonProperty("status")
    val status: Order.Status? = null,
    @field:JsonProperty("complete")
    val complete: kotlin.Boolean? = null
) {

    /**
    * Order Status
    * Values: PLACED,APPROVED,DELIVERED
    */
    
    enum class Status(val value: kotlin.String){
        @JsonProperty(value = "placed") PLACED("placed"),
        @JsonProperty(value = "approved") APPROVED("approved"),
        @JsonProperty(value = "delivered") DELIVERED("delivered");
    }
}

