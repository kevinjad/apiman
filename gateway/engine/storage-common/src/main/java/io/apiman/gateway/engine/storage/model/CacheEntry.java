/*
 * Copyright 2015 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.apiman.gateway.engine.storage.model;


import java.io.Serializable;

/**
 * A cache entry whose head and data are represented as strings.
 */
public class CacheEntry implements Serializable {
    private String head;
    private String data;
    private long expiresOn;

    /**
     * Constructor.
     */
    public CacheEntry() {
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the expiresOn
     */
    public long getExpiresOn() {
        return expiresOn;
    }

    /**
     * @param expiresOn the expiresOn to set
     */
    public void setExpiresOn(long expiresOn) {
        this.expiresOn = expiresOn;
    }

    /**
     * @return the head
     */
    public String getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(String head) {
        this.head = head;
    }
}
