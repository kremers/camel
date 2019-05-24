/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.aws.sqs.springboot;

import javax.annotation.Generated;
import com.amazonaws.services.sqs.AmazonSQS;
import org.apache.camel.component.aws.sqs.SqsOperations;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The aws-sqs component is used for sending and receiving messages to Amazon's
 * SQS service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.aws-sqs")
public class SqsComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the aws-sqs component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * The AWS SQS default configuration
     */
    private SqsConfigurationNestedConfiguration configuration;
    /**
     * Amazon AWS Access Key
     */
    private String accessKey;
    /**
     * Amazon AWS Secret Key
     */
    private String secretKey;
    /**
     * Specify the queue region which could be used with queueOwnerAWSAccountId
     * to build the service URL.
     */
    private String region;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;

    public SqsConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            SqsConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public static class SqsConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.aws.sqs.SqsConfiguration.class;
        /**
         * The hostname of the Amazon AWS cloud.
         */
        private String amazonAWSHost = "amazonaws.com";
        /**
         * Name of queue. The queue will be created if they don't already
         * exists.
         */
        private String queueName;
        /**
         * Amazon AWS Access Key
         */
        private String accessKey;
        /**
         * Amazon AWS Secret Key
         */
        private String secretKey;
        /**
         * Delete message from SQS after it has been read
         */
        private Boolean deleteAfterRead = true;
        /**
         * To use the AmazonSQS as client
         */
        private AmazonSQS amazonSQSClient;
        /**
         * The duration (in seconds) that the received messages are hidden from
         * subsequent retrieve requests after being retrieved by a
         * ReceiveMessage request to set in the
         * com.amazonaws.services.sqs.model.SetQueueAttributesRequest. This only
         * make sense if its different from defaultVisibilityTimeout. It changes
         * the queue visibility timeout attribute permanently.
         */
        private Integer visibilityTimeout;
        /**
         * A list of attribute names to receive when consuming. Multiple names
         * can be separated by comma.
         */
        private String attributeNames;
        /**
         * A list of message attribute names to receive when consuming. Multiple
         * names can be separated by comma.
         */
        private String messageAttributeNames;
        /**
         * The default visibility timeout (in seconds)
         */
        private Integer defaultVisibilityTimeout;
        /**
         * Delay sending messages for a number of seconds.
         */
        private Integer delaySeconds;
        /**
         * Define if you want to apply delaySeconds option to the queue or on
         * single messages
         */
        private Boolean delayQueue = false;
        /**
         * The maximumMessageSize (in bytes) an SQS message can contain for this
         * queue.
         */
        private Integer maximumMessageSize;
        /**
         * The messageRetentionPeriod (in seconds) a message will be retained by
         * SQS for this queue.
         */
        private Integer messageRetentionPeriod;
        /**
         * The policy for this queue
         */
        private String policy;
        /**
         * Specify the policy that send message to DeadLetter queue. See detail
         * at Amazon docs.
         */
        private String redrivePolicy;
        /**
         * If enabled then a scheduled background task will keep extending the
         * message visibility on SQS. This is needed if it takes a long time to
         * process the message. If set to true defaultVisibilityTimeout must be
         * set. See details at Amazon docs.
         */
        private Boolean extendMessageVisibility = false;
        /**
         * If you do not specify WaitTimeSeconds in the request, the queue
         * attribute ReceiveMessageWaitTimeSeconds is used to determine how long
         * to wait.
         */
        private Integer receiveMessageWaitTimeSeconds;
        /**
         * Duration in seconds (0 to 20) that the ReceiveMessage action call
         * will wait until a message is in the queue to include in the response.
         */
        private Integer waitTimeSeconds;
        /**
         * Specify the queue owner aws account id when you need to connect the
         * queue with different account owner.
         */
        private String queueOwnerAWSAccountId;
        /**
         * Whether or not to send the DeleteMessage to the SQS queue if an
         * exchange fails to get through a filter. If 'false' and exchange does
         * not make it through a Camel filter upstream in the route, then don't
         * send DeleteMessage.
         */
        private Boolean deleteIfFiltered = true;
        /**
         * Specify the queue region which could be used with
         * queueOwnerAWSAccountId to build the service URL.
         */
        private String region;
        /**
         * Allows you to use multiple threads to poll the sqs queue to increase
         * throughput
         */
        private Integer concurrentConsumers = 1;
        /**
         * To define the queueUrl explicitly. All other parameters, which would
         * influence the queueUrl, are ignored. This parameter is intended to be
         * used, to connect to a mock implementation of SQS, for testing
         * purposes.
         */
        private String queueUrl;
        /**
         * To define a proxy host when instantiating the SQS client
         */
        private String proxyHost;
        /**
         * To define a proxy port when instantiating the SQS client
         */
        private Integer proxyPort;
        /**
         * The ID of an AWS-managed customer master key (CMK) for Amazon SQS or
         * a custom CMK.
         */
        private String kmsMasterKeyId;
        /**
         * The length of time, in seconds, for which Amazon SQS can reuse a data
         * key to encrypt or decrypt messages before calling AWS KMS again. An
         * integer representing seconds, between 60 seconds (1 minute) and
         * 86,400 seconds (24 hours). Default: 300 (5 minutes).
         */
        private Integer kmsDataKeyReusePeriodSeconds;
        /**
         * Define if Server Side Encryption is enabled or not on the queue
         */
        private Boolean serverSideEncryptionEnabled = false;
        /**
         * Only for FIFO queues. Strategy for setting the messageGroupId on the
         * message. Can be one of the following options: *useConstant*,
         * *useExchangeId*, *usePropertyValue*. For the *usePropertyValue*
         * option, the value of property "CamelAwsMessageGroupId" will be used.
         */
        private String messageGroupIdStrategy;
        /**
         * Only for FIFO queues. Strategy for setting the messageDeduplicationId
         * on the message. Can be one of the following options: *useExchangeId*,
         * *useContentBasedDeduplication*. For the
         * *useContentBasedDeduplication* option, no messageDeduplicationId will
         * be set on the message.
         */
        private String messageDeduplicationIdStrategy = "useExchangeId";
        /**
         * The operation to do in case the user don't want to send only a
         * message
         */
        private SqsOperations operation;
        /**
         * Setting the autocreation of the queue
         */
        private Boolean autoCreateQueue = true;

        public String getAmazonAWSHost() {
            return amazonAWSHost;
        }

        public void setAmazonAWSHost(String amazonAWSHost) {
            this.amazonAWSHost = amazonAWSHost;
        }

        public String getQueueName() {
            return queueName;
        }

        public void setQueueName(String queueName) {
            this.queueName = queueName;
        }

        public String getAccessKey() {
            return accessKey;
        }

        public void setAccessKey(String accessKey) {
            this.accessKey = accessKey;
        }

        public String getSecretKey() {
            return secretKey;
        }

        public void setSecretKey(String secretKey) {
            this.secretKey = secretKey;
        }

        public Boolean getDeleteAfterRead() {
            return deleteAfterRead;
        }

        public void setDeleteAfterRead(Boolean deleteAfterRead) {
            this.deleteAfterRead = deleteAfterRead;
        }

        public AmazonSQS getAmazonSQSClient() {
            return amazonSQSClient;
        }

        public void setAmazonSQSClient(AmazonSQS amazonSQSClient) {
            this.amazonSQSClient = amazonSQSClient;
        }

        public Integer getVisibilityTimeout() {
            return visibilityTimeout;
        }

        public void setVisibilityTimeout(Integer visibilityTimeout) {
            this.visibilityTimeout = visibilityTimeout;
        }

        public String getAttributeNames() {
            return attributeNames;
        }

        public void setAttributeNames(String attributeNames) {
            this.attributeNames = attributeNames;
        }

        public String getMessageAttributeNames() {
            return messageAttributeNames;
        }

        public void setMessageAttributeNames(String messageAttributeNames) {
            this.messageAttributeNames = messageAttributeNames;
        }

        public Integer getDefaultVisibilityTimeout() {
            return defaultVisibilityTimeout;
        }

        public void setDefaultVisibilityTimeout(Integer defaultVisibilityTimeout) {
            this.defaultVisibilityTimeout = defaultVisibilityTimeout;
        }

        public Integer getDelaySeconds() {
            return delaySeconds;
        }

        public void setDelaySeconds(Integer delaySeconds) {
            this.delaySeconds = delaySeconds;
        }

        public Boolean getDelayQueue() {
            return delayQueue;
        }

        public void setDelayQueue(Boolean delayQueue) {
            this.delayQueue = delayQueue;
        }

        public Integer getMaximumMessageSize() {
            return maximumMessageSize;
        }

        public void setMaximumMessageSize(Integer maximumMessageSize) {
            this.maximumMessageSize = maximumMessageSize;
        }

        public Integer getMessageRetentionPeriod() {
            return messageRetentionPeriod;
        }

        public void setMessageRetentionPeriod(Integer messageRetentionPeriod) {
            this.messageRetentionPeriod = messageRetentionPeriod;
        }

        public String getPolicy() {
            return policy;
        }

        public void setPolicy(String policy) {
            this.policy = policy;
        }

        public String getRedrivePolicy() {
            return redrivePolicy;
        }

        public void setRedrivePolicy(String redrivePolicy) {
            this.redrivePolicy = redrivePolicy;
        }

        public Boolean getExtendMessageVisibility() {
            return extendMessageVisibility;
        }

        public void setExtendMessageVisibility(Boolean extendMessageVisibility) {
            this.extendMessageVisibility = extendMessageVisibility;
        }

        public Integer getReceiveMessageWaitTimeSeconds() {
            return receiveMessageWaitTimeSeconds;
        }

        public void setReceiveMessageWaitTimeSeconds(
                Integer receiveMessageWaitTimeSeconds) {
            this.receiveMessageWaitTimeSeconds = receiveMessageWaitTimeSeconds;
        }

        public Integer getWaitTimeSeconds() {
            return waitTimeSeconds;
        }

        public void setWaitTimeSeconds(Integer waitTimeSeconds) {
            this.waitTimeSeconds = waitTimeSeconds;
        }

        public String getQueueOwnerAWSAccountId() {
            return queueOwnerAWSAccountId;
        }

        public void setQueueOwnerAWSAccountId(String queueOwnerAWSAccountId) {
            this.queueOwnerAWSAccountId = queueOwnerAWSAccountId;
        }

        public Boolean getDeleteIfFiltered() {
            return deleteIfFiltered;
        }

        public void setDeleteIfFiltered(Boolean deleteIfFiltered) {
            this.deleteIfFiltered = deleteIfFiltered;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public Integer getConcurrentConsumers() {
            return concurrentConsumers;
        }

        public void setConcurrentConsumers(Integer concurrentConsumers) {
            this.concurrentConsumers = concurrentConsumers;
        }

        public String getQueueUrl() {
            return queueUrl;
        }

        public void setQueueUrl(String queueUrl) {
            this.queueUrl = queueUrl;
        }

        public String getProxyHost() {
            return proxyHost;
        }

        public void setProxyHost(String proxyHost) {
            this.proxyHost = proxyHost;
        }

        public Integer getProxyPort() {
            return proxyPort;
        }

        public void setProxyPort(Integer proxyPort) {
            this.proxyPort = proxyPort;
        }

        public String getKmsMasterKeyId() {
            return kmsMasterKeyId;
        }

        public void setKmsMasterKeyId(String kmsMasterKeyId) {
            this.kmsMasterKeyId = kmsMasterKeyId;
        }

        public Integer getKmsDataKeyReusePeriodSeconds() {
            return kmsDataKeyReusePeriodSeconds;
        }

        public void setKmsDataKeyReusePeriodSeconds(
                Integer kmsDataKeyReusePeriodSeconds) {
            this.kmsDataKeyReusePeriodSeconds = kmsDataKeyReusePeriodSeconds;
        }

        public Boolean getServerSideEncryptionEnabled() {
            return serverSideEncryptionEnabled;
        }

        public void setServerSideEncryptionEnabled(
                Boolean serverSideEncryptionEnabled) {
            this.serverSideEncryptionEnabled = serverSideEncryptionEnabled;
        }

        public String getMessageGroupIdStrategy() {
            return messageGroupIdStrategy;
        }

        public void setMessageGroupIdStrategy(String messageGroupIdStrategy) {
            this.messageGroupIdStrategy = messageGroupIdStrategy;
        }

        public String getMessageDeduplicationIdStrategy() {
            return messageDeduplicationIdStrategy;
        }

        public void setMessageDeduplicationIdStrategy(
                String messageDeduplicationIdStrategy) {
            this.messageDeduplicationIdStrategy = messageDeduplicationIdStrategy;
        }

        public SqsOperations getOperation() {
            return operation;
        }

        public void setOperation(SqsOperations operation) {
            this.operation = operation;
        }

        public Boolean getAutoCreateQueue() {
            return autoCreateQueue;
        }

        public void setAutoCreateQueue(Boolean autoCreateQueue) {
            this.autoCreateQueue = autoCreateQueue;
        }
    }
}