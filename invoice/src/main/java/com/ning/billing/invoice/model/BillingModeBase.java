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

public abstract class BillingModeBase {
//    public BigDecimal calculateNumberOfBillingCycles(final DateTime startDate, final DateTime endDate, final DateTime targetDate, final int billingCycleDay, final BillingPeriod billingPeriod) throws InvalidDateSequenceException {
//        if (endDate.isBefore(startDate)) {throw new InvalidDateSequenceException();}
//        if (targetDate.isBefore(startDate)) {throw new InvalidDateSequenceException();}
//
//        if (billingPeriod == BillingPeriod.NO_BILLING_PERIOD) {
//            return BigDecimal.ZERO;
//        }
//
//        BigDecimal precedingProRation = calculateProRationBeforeFirstBillingPeriod(startDate, billingCycleDay, billingPeriod);
//
//        DateTime firstBillCycleDate = calculateBillingCycleDateOnOrAfter(startDate, billingCycleDay);
//        DateTime endBillCycleDate;
//        BigDecimal trailingProRation;
//        BigDecimal numberOfBillingPeriods;
//
//        DateTime effectiveEndDate = calculateEffectiveEndDate(firstBillCycleDate, targetDate, endDate, billingPeriod);
//        endBillCycleDate = calculateLastBillingCycleDateBefore(effectiveEndDate, firstBillCycleDate, billingCycleDay, billingPeriod);
//        numberOfBillingPeriods = calculateNumberOfWholeBillingPeriods(firstBillCycleDate, endBillCycleDate, billingPeriod);
//
//        trailingProRation = calculateProRationAfterLastBillingCycleDate(effectiveEndDate, endBillCycleDate, billingPeriod);
//
//        return precedingProRation.add(numberOfBillingPeriods).add(trailingProRation);
//    }
//
//    public BigDecimal calculateNumberOfBillingCycles(final DateTime startDate, final DateTime targetDate, final int billingCycleDay, final BillingPeriod billingPeriod) throws InvalidDateSequenceException {
//        if (targetDate.isBefore(startDate)) {throw new InvalidDateSequenceException();}
//
//        BigDecimal precedingProRation = calculateProRationBeforeFirstBillingPeriod(startDate, billingCycleDay, billingPeriod);
//
//        DateTime firstBillCycleDate = calculateBillingCycleDateOnOrAfter(startDate, billingCycleDay);
//        DateTime endBillCycleDate = calculateBillingCycleDateAfter(targetDate, firstBillCycleDate, billingCycleDay, billingPeriod);
//        BigDecimal numberOfBillingPeriods = calculateNumberOfWholeBillingPeriods(firstBillCycleDate, endBillCycleDate, billingPeriod);
//
//        return precedingProRation.add(numberOfBillingPeriods);
//    }
//
//    boolean isNotBetween(DateTime targetDate, DateTime startDate, DateTime endDate) {
//        return (targetDate.isBefore(startDate) || !targetDate.isBefore(endDate));
//    }
//
//    public abstract DateTime calculateEffectiveEndDate(final DateTime startDate, final DateTime targetDate, final int billingCycleDay, final BillingPeriod billingPeriod);
//
//    public abstract DateTime calculateEffectiveEndDate(final DateTime startDate, final DateTime endDate, final DateTime targetDate, final int billingCycleDay, final BillingPeriod billingPeriod);
//
//    protected abstract BigDecimal calculateNumberOfWholeBillingPeriods(final DateTime startDate, final DateTime endDate, final BillingPeriod billingPeriod);
//
//    protected abstract DateTime calculateBillingCycleDateOnOrAfter(final DateTime date, final int billingCycleDay);
//
//    protected abstract DateTime calculateBillingCycleDateAfter(final DateTime date, final DateTime billingCycleDate, final int billingCycleDay, final BillingPeriod billingPeriod);
//
//    protected abstract DateTime calculateLastBillingCycleDateBefore(final DateTime date, final DateTime previousBillCycleDate, final int billingCycleDay, final BillingPeriod billingPeriod);
//
//    protected abstract BigDecimal calculateProRationBeforeFirstBillingPeriod(final DateTime startDate, final int billingCycleDay, final BillingPeriod billingPeriod);
//
//    protected abstract BigDecimal calculateProRationAfterLastBillingCycleDate(final DateTime endDate, final DateTime previousBillThroughDate, final BillingPeriod billingPeriod);
//
//    protected abstract DateTime calculateEffectiveEndDate(final DateTime billCycleDate, final DateTime targetDate, final DateTime endDate, final BillingPeriod billingPeriod);
}
