package com.ricoh.paypal.pojo;import com.fasterxml.jackson.annotation.JsonProperty;import lombok.Data;import java.util.List;/** * @author xionglijing * @date 2021/10/8 20:17 * @description */@Datapublic class PayPalSubscriptionPlanParam{    /**     * 贝宝为该计划生成的独特 ID。     */    private String id;    /**     * 产品ID 最小值 6 最大值 50     */    @JsonProperty("product_id")    private String productId;    /**     * 名称     */    private String name;    /**     * 地位 枚举  CREATED     * CREATED  已创建计划。在此状态下无法创建计划的订阅     * INACTIVE 这个计划不起作用     * ACTIVE   计划处于活动状态。您只能为处于此状态的计划创建订阅计划处于活动状态。您只能为处于此状态的计划创建订阅     */    private String status;    /**     * 描述 最小长度: 1 最大长度: 127     */    private String description;    /**     * 计费计划     */    @JsonProperty(value = "billing_cycles")    private List<BillingCycles> billingCycles;    /**     * 付款偏好 payment_preferences     */    @JsonProperty(value = "payment_preferences")    private PaymentPreferences paymentPreferences;    /**     * 税务     */    private Taxes taxes;    /**     * 指示是否可以通过提供商品或服务的数量来订阅此计划     */    @JsonProperty("quantity_supported")    private Boolean quantitySupported;    /**     * 创建时间     */    @JsonProperty("create_time")    private String createTime;    /**     * 更新时间     */    @JsonProperty("update_time")    private String updateTime;}