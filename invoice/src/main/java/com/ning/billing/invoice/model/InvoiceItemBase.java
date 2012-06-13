/*
 * Copyright 2010-2011 Ning, Inc.
 *
 * Ning licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.ning.billing.invoice.model;

import javax.annotation.Nullable;
import java.math.BigDecimal;
import java.util.UUID;

import org.joda.time.DateTime;

import com.ning.billing.catalog.api.Currency;
import com.ning.billing.invoice.api.InvoiceItem;
import com.ning.billing.invoice.api.InvoiceItemType;
import com.ning.billing.util.entity.EntityBase;

public abstract class InvoiceItemBase extends EntityBase implements InvoiceItem {
    protected final UUID invoiceId;
    protected final UUID accountId;
    protected final UUID subscriptionId;
    protected final UUID bundleId;
    protected final String planName;
    protected final String phaseName;
    protected final DateTime startDate;
    protected final DateTime endDate;
    protected final BigDecimal amount;
    protected final Currency currency;
    protected final InvoiceItemType invoiceItemType;

    public InvoiceItemBase(final UUID invoiceId, final UUID accountId, final UUID bundleId, final UUID subscriptionId, final String planName, final String phaseName,
                           final DateTime startDate, final DateTime endDate, final BigDecimal amount, final Currency currency, final InvoiceItemType invoiceItemType) {
        this(UUID.randomUUID(), invoiceId, accountId, bundleId, subscriptionId, planName, phaseName,
             startDate, endDate, amount, currency, invoiceItemType);
    }

    public InvoiceItemBase(final UUID id, final UUID invoiceId, final UUID accountId, @Nullable final UUID bundleId,
                           @Nullable final UUID subscriptionId, @Nullable final String planName, @Nullable final String phaseName,
                           final DateTime startDate, final DateTime endDate, final BigDecimal amount, final Currency currency,
                           final InvoiceItemType invoiceItemType) {
        super(id);
        this.invoiceId = invoiceId;
        this.accountId = accountId;
        this.subscriptionId = subscriptionId;
        this.bundleId = bundleId;
        this.planName = planName;
        this.phaseName = phaseName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
        this.currency = currency;
        this.invoiceItemType = invoiceItemType;
    }

    @Override
    public UUID getInvoiceId() {
        return invoiceId;
    }

    @Override
    public UUID getBundleId() {
        return bundleId;
    }

    public UUID getAccountId() {
        return accountId;
    }

    @Override
    public UUID getSubscriptionId() {
        return subscriptionId;
    }

    @Override
    public String getPlanName() {
        return planName;
    }

    @Override
    public String getPhaseName() {
        return phaseName;
    }

    @Override
    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public DateTime getStartDate() {
        return startDate;
    }

    @Override
    public DateTime getEndDate() {
        return endDate;
    }

    @Override
    public Currency getCurrency() {
        return currency;
    }

    @Override
    public InvoiceItemType getInvoiceItemType() {
        return invoiceItemType;
    }

    @Override
    public abstract InvoiceItem asReversingItem();

    @Override
    public abstract String getDescription();

    @Override
    public abstract int compareTo(InvoiceItem invoiceItem);
}
