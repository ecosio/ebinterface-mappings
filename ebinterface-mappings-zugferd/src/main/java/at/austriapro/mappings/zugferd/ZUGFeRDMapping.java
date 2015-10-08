package at.austriapro.mappings.zugferd;


import at.austriapro.mappings.ebinterface.generated.*;
import at.austriapro.mappings.zugferd.generated.*;
import at.austriapro.utils.ISO639ConversionUtil;

import com.google.common.base.Strings;

import com.google.common.collect.Iterables;


import org.apache.commons.lang3.BooleanUtils;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;

import at.austriapro.Mapping;
import at.austriapro.MappingException;
import at.austriapro.MappingFactory;
import at.austriapro.utils.DocumentTypeUtils;

/**
 * Performs mappings from/to ZUGFeRD
 */
public class ZUGFeRDMapping extends Mapping {

  private MappingFactory.MappingType mappingType;
  private DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("yyyyMMdd");

  private static final Logger LOG = LoggerFactory.getLogger(ZUGFeRDMapping.class.getName());


  public ZUGFeRDMapping(MappingFactory.MappingType mappingType) {
    this.mappingType = mappingType;
  }

  /*
  Hide parameterless constructor
   */
  private ZUGFeRDMapping() {
  }


  /**
   * Perform a mapping from ebInterface to ZUGFeRD
   */
  @Override
  public byte[] mapFromebInterface(String ebinterface) throws MappingException {

    //Retrieve an Invoice object
    Invoice invoice = DocumentTypeUtils.parseebInterface(ebinterface);

    //Perform mapping
    CrossIndustryDocumentType zugferd = performMapping(invoice);

    return DocumentTypeUtils.writeZUGFeRD(zugferd);
  }


  /**
   * Map the ebInterface object to a ZUGFeRD object
   */
  private CrossIndustryDocumentType performMapping(Invoice invoice) {

    //Get an empty cross industry document type
    CrossIndustryDocumentType zugferd = getEmptyCrossIndustryDocumentType();

    //eb:ROOT element attributes
    mapRootAttributes(zugferd, invoice);

    //eb:Signature
    mapSignature(zugferd, invoice.getSignature());

    //eb:Cancelled original document
    //exdended: rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeAgreement/ram:AdditionalReferencedDocument
    //basic and comfort: IncludedNote
    mapCancelledOriginalDocument(zugferd, invoice.getCancelledOriginalDocument());

    //eb:Related documents
    //exdended: rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeAgreement/ram:AdditionalReferencedDocument
    //basic and comfort: IncludedNote
    mapRelatedDocuments(zugferd, invoice.getRelatedDocuments());

    //eb:Delivery
    //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeDelivery/ram:ShipToTradeParty
    mapDelivery(zugferd, invoice.getDelivery());

    //eb:Biller
    //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeAgreement/ram:SellerTradeParty
    mapBiller(zugferd, invoice.getBiller());

    //eb:Invoice Recipient
    //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeAgreement/ram:BuyerTradeParty
    mapInvoiceRecipient(zugferd, invoice.getInvoiceRecipient());

    //eb:Ordering Party
    //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeAgreement/ram:ProductEndUserTradeParty
    mapOrderingParty(zugferd, invoice.getOrderingParty());

    //eb:Details
    //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem
    mapDetails(zugferd, invoice.getDetails());

    //eb:ReductionAndSurchargeDetails
    mapReductionAndSurchargeDetails(zugferd, invoice.getReductionAndSurchargeDetails());

    //eb:Tax
    mapTax(zugferd, invoice.getTax());

    //eb:TotalGrossAmount
    mapTotalGrossAmount(zugferd, invoice.getTotalGrossAmount());

    //eb:PayableAmount
    mapPayableAmount(zugferd, invoice.getPayableAmount());

    //eb:PaymentMethod
    mapPaymentMethod(zugferd, invoice.getPaymentMethod());

    //eb:PaymentConditions
    mapPaymentConditions(zugferd, invoice.getPaymentConditions());

    //eb:PresentationDetails
    mapPresentationDetails(zugferd, invoice.getPresentationDetails());

    //eb:Comment
    mapComment(zugferd, invoice.getComment());

    //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeSettlement

    //TODO - we need to refactor this - we always map from the ebInterface elements to the ZUGFeRD elements, by taking the
    //top level elements in ebInterface as a starting point
    //mapTradeSettlement(zugferd, invoice);

    return zugferd;
  }


  /**
   * Map details of ebInterface comments
   * @param zugferd
   * @param comment
   */
  private void mapComment(CrossIndustryDocumentType zugferd, String comment) {

  }


  /**
   * Map presentation details
   * @param zugferd
   * @param presentationDetails
   */
  private void mapPresentationDetails(CrossIndustryDocumentType zugferd,
                                      PresentationDetails presentationDetails) {

  }

  /**
   * Map the details of payment conditions
   * @param zugferd
   * @param paymentConditions
   */
  private void mapPaymentConditions(CrossIndustryDocumentType zugferd,
                                    PaymentConditions paymentConditions) {

  }


  /**
   * Map details of payment method
   * @param zugferd
   * @param paymentMethod
   */
  private void mapPaymentMethod(CrossIndustryDocumentType zugferd, PaymentMethod paymentMethod) {

  }

  /**
   * Map details of payable amount
   * @param zugferd
   * @param payableAmount
   */
  private void mapPayableAmount(CrossIndustryDocumentType zugferd, BigDecimal payableAmount) {

  }

  /**
   * ebInterface total gross details
   * @param zugferd
   * @param totalGrossAmount
   */
  private void mapTotalGrossAmount(CrossIndustryDocumentType zugferd, BigDecimal totalGrossAmount) {

  }


  /**
   * Map the tax details to the ZUGFeRD equivalent
   * @param zugferd
   * @param tax
   */
  private void mapTax(CrossIndustryDocumentType zugferd, Tax tax) {

  }


  /**
   * Map the different reductions and surcharges in ebInterface to the respective fields in ZUGFeRD
   * @param zugferd
   * @param reductionAndSurchargeDetails
   */
  private void mapReductionAndSurchargeDetails(CrossIndustryDocumentType zugferd,
                                               ReductionAndSurchargeDetails reductionAndSurchargeDetails) {

  }

  /**
   * Map the details section of ebInterace, containing the different line items, to the correct
   * fields in ZUGFeRD
   * from: eb:Details
   * to: rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem
   * @param zugferd
   * @param details
   */
  private void mapDetails(CrossIndustryDocumentType zugferd, Details details) {
    if (details.getItemLists() != null && details.getItemLists().size() > 0) {
      //TODO Elemente für Header und Footer nicht in ZUGFeRD verfügbar
      //eb:HeaderDescription
      //eb:ItemList/HeaderDescription
      //eb:ItemList/FooterDescription
      //eb:FooterDescription

      String
          documentCurrency =
          zugferd.getSpecifiedSupplyChainTradeTransaction()
              .getApplicableSupplyChainTradeSettlement().getInvoiceCurrencyCode().getValue();

      //Create a collection of SupplyChainTradeLineItems
      List<SupplyChainTradeLineItemType> listSCTLI = new ArrayList<SupplyChainTradeLineItemType>();

      //loop all eb:ItemLists
      for (ItemList itemList : details.getItemLists()) {
        if (itemList.getListLineItems() != null && itemList.getListLineItems().size() > 0) {
          //loop all eb:ListLineItems
          for (ListLineItem item : itemList.getListLineItems()) {
            //Create a SupplyChainTradeLineItem for a Detail
            SupplyChainTradeLineItemType sctli = new SupplyChainTradeLineItemType();

            //create a SpecifiedTradeProduct
            //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedTradeProduct
            TradeProductType stp = new TradeProductType();
            sctli.withSpecifiedTradeProduct(stp);

            if (!MappingFactory.MappingType.ZUGFeRD_BASIC_1p0.equals(mappingType)) {
              //eb:PositionNumber
              //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:AssociatedDocumentLineDocument/ram:LineID
              if (item.getPositionNumber() != null) {
                sctli.withAssociatedDocumentLineDocument(new DocumentLineDocumentType().withLineID(
                    new IDType().withValue(item.getPositionNumber().toString())));
              }
            }

            //eb:Description
            if (item.getDescriptions() != null && item.getDescriptions().size() > 0) {
              StringBuilder zugDesc = new StringBuilder();

              int i = 0;

              //the first description entry will be used for ZUGFeRD.name, the other entries are ZUGFeRD.description
              for (String ebDesc : item.getDescriptions()) {
                if (i == 0) {
                  stp.withName(new TextType().withValue(ebDesc));
                } else {
                  if (!MappingFactory.MappingType.ZUGFeRD_BASIC_1p0.equals(mappingType)) {
                    zugDesc.append(ebDesc).append("\n");
                  }
                }

                i++;
              }

              if (zugDesc.toString().trim().length() > 0) {
                stp.withDescription(new TextType().withValue(zugDesc.toString().trim()));
              }
            }

            if (!MappingFactory.MappingType.ZUGFeRD_BASIC_1p0.equals(mappingType)) {
              //eb:ArticleNumber
              if (item.getArticleNumbers() != null && item.getArticleNumbers().size() > 0) {
                for (ArticleNumber art : item.getArticleNumbers()) {
                  if (art.getArticleNumberType().value().equals("GTIN")) {
                    //GTIN
                    //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedTradeProduct/ram:GlobalID
                    stp.withGlobalID(new IDType().withValue(art.getContent()));
                  } else if (art.getArticleNumberType().value()
                      .equals("InvoiceRecipientsArticleNumber")) {
                    //InvoiceRecipientsArticleNumber
                    //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedTradeProduct/ram:BuyerAssignedID
                    stp.withBuyerAssignedID(new IDType().withValue(art.getContent()));
                  } else if (art.getArticleNumberType().value().equals("BillersArticleNumber")) {
                    //BillersArticleNumber
                    //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedTradeProduct/ram:SellerAssignedID
                    stp.withSellerAssignedID(new IDType().withValue(art.getContent()));
                  } else if (art.getArticleNumberType().value().equals("PZN")) {
                    //PZN
                    //No element in ZUGFeRD
                    //TODO
                  }
                }
              }
            }

            //Create SupplyChainTradeDelivery and add it to ZUGFeRD
            //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeDelivery
            SupplyChainTradeDeliveryType ssctd = new SupplyChainTradeDeliveryType();
            sctli.withSpecifiedSupplyChainTradeDelivery(ssctd);

            //eb:Quantity
            //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeDelivery/ram:BilledQuantity
            if (item.getQuantity() != null) {
              ssctd.withBilledQuantity(new QuantityType().withValue(item.getQuantity().getValue())
                                           .withUnitCode(item.getQuantity().getUnit()));
            }

            //Create SpecifiedSupplyChainTradeAgreement and add it to ZUGFeRD
            //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeAgreement
            SupplyChainTradeAgreementType scta = new SupplyChainTradeAgreementType();
            sctli.withSpecifiedSupplyChainTradeAgreement(scta);

            if (!MappingFactory.MappingType.ZUGFeRD_BASIC_1p0.equals(mappingType)) {
              if (item.getUnitPrice() != null) {
                //Create NetPriceProductTradePrice and add it to ZUGFeRD
                TradePriceType npptp = new TradePriceType();
                scta.withNetPriceProductTradePrice(npptp);

                //eb:UnitPrice
                //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeAgreement/ram:NetPriceProductTradePrice
                npptp.withChargeAmount(new AmountType().withValue(item.getUnitPrice().getValue()));

                if (item.getUnitPrice().getBaseQuantity() != null) {
                  npptp.withBasisQuantity(
                      new QuantityType().withValue(item.getUnitPrice().getBaseQuantity())
                          .withUnitCode(item.getQuantity().getUnit()));
                }
              }
            }

            //Create SpecifiedSupplyChainTradeSettlement and add it to ZUGFeRD
            //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeSettlement
            SupplyChainTradeSettlementType scts = new SupplyChainTradeSettlementType();
            sctli.withSpecifiedSupplyChainTradeSettlement(scts);

            if (!MappingFactory.MappingType.ZUGFeRD_BASIC_1p0.equals(mappingType)) {
              //Create ApplicableTradeTax and add it to ZUGFeRD
              TradeTaxType att = new TradeTaxType();
              scts.withApplicableTradeTax(att);

              //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeSettlement/ram:ApplicableTradeTax/ram:TypeCode
              att.withTypeCode(new TaxTypeCodeType().withValue("VAT"));

              if (item.getTaxExemption() != null) {
                //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeSettlement/ram:ApplicableTradeTax/ram:ExemptionReason
                att.withExemptionReason(
                    new TextType().withValue(item.getTaxExemption().getValue()));

                //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeSettlement/ram:ApplicableTradeTax/ram:CategoryCode
                att.withCategoryCode(new TaxCategoryCodeType().withValue("E"));
              } else {
                //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeSettlement/ram:ApplicableTradeTax/ram:CategoryCode
                att.withCategoryCode(new TaxCategoryCodeType().withValue("S"));

                //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeSettlement/ram:ApplicableTradeTax/ram:ApplicablePercent
                att.withApplicablePercent(
                    new PercentType().withValue(item.getVATRate().getValue()));
              }
            }

            //Create GrossPriceProductTradePrice and add it to ZUGFeRD
            //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeAgreement/ram:GrossPriceProductTradePrice
            TradePriceType gpptp = new TradePriceType();
            scta.withGrossPriceProductTradePrice(gpptp);

            if (!MappingFactory.MappingType.ZUGFeRD_BASIC_1p0.equals(mappingType)) {

              //eb:DiscountFlag
              //TODO - not in ZUGFeRD

              //eb:ReductionAndSurchargeListLineItemDetails
              if (item
                      .getReductionAndSurchargeListLineItemDetails() != null && item
                                                                                    .getReductionAndSurchargeListLineItemDetails()
                                                                                    .getReductionListLineItemsAndSurchargeListLineItemsAndOtherVATableTaxListLineItems()
                                                                                != null && item
                                                                                               .getReductionAndSurchargeListLineItemDetails()
                                                                                               .getReductionListLineItemsAndSurchargeListLineItemsAndOtherVATableTaxListLineItems()
                                                                                               .size()
                                                                                           > 0) {
                for (JAXBElement<? extends Serializable> rSVItem : item
                    .getReductionAndSurchargeListLineItemDetails()
                    .getReductionListLineItemsAndSurchargeListLineItemsAndOtherVATableTaxListLineItems()) {
                  boolean chargeIndicator;
                  BigDecimal baseAmount = null;
                  BigDecimal percentage = null;
                  BigDecimal amount = null;
                  String comment = null;

                  if (rSVItem.getName().getLocalPart().equals("ReductionListLineItem") || rSVItem
                      .getName().getLocalPart().equals("SurchargeListLineItem")) {
                    ReductionAndSurchargeBaseType
                        rsItem =
                        (ReductionAndSurchargeBaseType) rSVItem.getValue();

                    //Surcharge (SurchargeListLineItem) => chargeIndicator: true
                    //Reduction (ReductionListLineItem) => chargeIndicator: false
                    chargeIndicator =
                        rSVItem.getName().getLocalPart().equals("SurchargeListLineItem");

                    if (rsItem.getBaseAmount() != null) {
                      //eb:BaseAmount
                      //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeAgreement/ram:GrossPriceProductTradePrice/ram:ChargeAmount/ram:AppliedTradeAllowanceCharge/ram:BasisAmount
                      baseAmount = rsItem.getBaseAmount();
                    }

                    if (rsItem.getPercentage() != null) {
                      //eb:Percentage
                      //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeAgreement/ram:GrossPriceProductTradePrice/ram:ChargeAmount/ram:AppliedTradeAllowanceCharge/ram:CalculationPercent
                      percentage = rsItem.getPercentage();
                    }

                    if (rsItem.getAmount() != null) {
                      //eb:Amount
                      //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeAgreement/ram:GrossPriceProductTradePrice/ram:ChargeAmount/ram:AppliedTradeAllowanceCharge/ram:ActualAmount
                      amount = rsItem.getAmount();
                    }

                    if (rsItem.getComment() != null) {
                      //eb:Comment
                      //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeAgreement/ram:GrossPriceProductTradePrice/ram:ChargeAmount/ram:AppliedTradeAllowanceCharge/ram:Reason
                      comment = rsItem.getComment();
                    }
                  } else { //rSVItem.getName().getLocalPart().equals("OtherVATableTaxListLineItem")
                    OtherVATableTaxBaseType
                        otherTaxItem =
                        (OtherVATableTaxBaseType) rSVItem.getValue();

                    //Taxes are surcharges => chargeIndicator: true
                    chargeIndicator = true;

                    if (otherTaxItem.getBaseAmount() != null) {
                      //eb:BaseAmount
                      //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeAgreement/ram:GrossPriceProductTradePrice/ram:ChargeAmount/ram:AppliedTradeAllowanceCharge/ram:BasisAmount
                      baseAmount = otherTaxItem.getBaseAmount();
                    }

                    if (otherTaxItem.getPercentage() != null) {
                      //eb:Percentage
                      //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeAgreement/ram:GrossPriceProductTradePrice/ram:ChargeAmount/ram:AppliedTradeAllowanceCharge/ram:CalculationPercent
                      percentage = otherTaxItem.getPercentage();
                    }

                    if (otherTaxItem.getAmount() != null) {
                      //eb:Amount
                      //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeAgreement/ram:GrossPriceProductTradePrice/ram:ChargeAmount/ram:AppliedTradeAllowanceCharge/ram:ActualAmount
                      amount = otherTaxItem.getAmount();
                    }

                    if (otherTaxItem.getTaxID() != null) {
                      //eb:TaxID
                      //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeAgreement/ram:GrossPriceProductTradePrice/ram:ChargeAmount/ram:AppliedTradeAllowanceCharge/ram:Reason
                      comment = otherTaxItem.getTaxID() + "\n";
                    }

                    if (otherTaxItem.getComment() != null) {
                      //eb:Comment
                      //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeAgreement/ram:GrossPriceProductTradePrice/ram:ChargeAmount/ram:AppliedTradeAllowanceCharge/ram:Reason
                      comment += otherTaxItem.getComment();
                    }
                  }

                  //Create TradeAllowanceCharge and add it to ZUGFeRD
                  //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeAgreement/ram:GrossPriceProductTradePrice/ram:ChargeAmount/ram:AppliedTradeAllowanceCharge
                  gpptp.withAppliedTradeAllowanceCharge(
                      getTradeAllowanceCharge(chargeIndicator, baseAmount, documentCurrency,
                                              percentage,
                                              amount, comment.trim()));
                }
              }
            }

            //eb:Delivery
            if (!MappingFactory.MappingType.ZUGFeRD_EXTENDED_1p0.equals(mappingType)
                && item.getDelivery() != null) {
              //Create the necessary elements in ZUGFeRD
              TradePartyType stttp = new TradePartyType();
              ssctd.withShipToTradeParty(stttp);

              //eb:DeliveryID
              //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeDelivery/ram:DeliveryNoteReferencedDocument/ram:ID
              ssctd.withDeliveryNoteReferencedDocument(new ReferencedDocumentType()
                                                           .withID(new IDType().withValue(
                                                               item.getDelivery()
                                                                   .getDeliveryID())));

              //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeDelivery/ram:ActualDeliverySupplyChainEvent/ram:OccurrenceDateTime/udt:DateTimeString
              if (item.getDelivery().getDate() != null) {
                //eb:Delivery/Date
                ssctd.withActualDeliverySupplyChainEvent(
                    new SupplyChainEventType().withOccurrenceDateTime(
                        new DateTimeType()
                            .withDateTimeString(new DateTimeType.DateTimeString().withValue(
                                dateTimeFormatter.print(item.getDelivery().getDate())).withFormat(
                                "102"))));
              } else if (item.getDelivery().getPeriod().getFromDate() != null) {
                //eb:Delivery/Period/FromDate
                ssctd.withActualDeliverySupplyChainEvent(new SupplyChainEventType()
                                                             .withOccurrenceDateTime(
                                                                 new DateTimeType()
                                                                     .withDateTimeString(
                                                                         new DateTimeType.DateTimeString()
                                                                             .withValue(
                                                                                 dateTimeFormatter
                                                                                     .print(
                                                                                         item.getDelivery()
                                                                                             .getPeriod()
                                                                                             .getFromDate()))
                                                                             .withFormat(
                                                                                 "102"))));
              }

              if (item.getDelivery().getAddress() != null) {

                //Create the necessary elements in ZUGFeRD
                stttp.withDefinedTradeContact(new TradeContactType());
                stttp.withPostalTradeAddress(new TradeAddressType());

                Address address = item.getDelivery().getAddress();

                String partyName = "";
                //Build the person name string
                if (!Strings.isNullOrEmpty(address.getSalutation())) {
                  partyName += address.getSalutation() + " ";
                }
                if (!Strings.isNullOrEmpty(address.getName())) {
                  partyName += address.getName();
                }

                //eb:Salutation and Name
                //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeDelivery/ram:ShipToTradeParty/ram:Name
                stttp.withName(new TextType().withValue(partyName));

                //eb:Street
                //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeDelivery/ram:ShipToTradeParty/ram:PostalTradeAddress/ram:LineOne
                stttp.getPostalTradeAddress()
                    .setLineOne(new TextType().withValue(address.getStreet()));

                //eb:Town
                //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeDelivery/ram:ShipToTradeParty/ram:PostalTradeAddress/ram:CityName
                stttp.getPostalTradeAddress()
                    .setCityName(new TextType().withValue(address.getTown()));

                //eb:ZIP
                //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeDelivery/ram:ShipToTradeParty/ram:PostalTradeAddress/ram:PostcodeCode
                stttp.getPostalTradeAddress().getPostcodeCode()
                    .add(new CodeType().withValue(address.getZIP()));

                //eb:Country Code
                //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeDelivery/ram:ShipToTradeParty/ram:PostalTradeAddress/ram:CountryID
                stttp.getPostalTradeAddress().setCountryID(
                    new CountryIDType().withValue(address.getCountry().getCountryCode().value()));

                //eb:Phone
                //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeDelivery/ram:ShipToTradeParty/ram:DefinedTradeContact/ram:TelephoneUniversalCommunication/ram:CompleteNumber
                stttp.getDefinedTradeContact().get(0)
                    .withTelephoneUniversalCommunication(
                        new UniversalCommunicationType().withCompleteNumber(
                            new TextType().withValue(address.getPhone())));

                //eb:Email
                //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeDelivery/ram:ShipToTradeParty/ram:DefinedTradeContact/ram:EmailURIUniversalCommunication/ram:CompleteNumber
                stttp.getDefinedTradeContact().get(0)
                    .withEmailURIUniversalCommunication(
                        new UniversalCommunicationType().withCompleteNumber(
                            new TextType().withValue(address.getEmail())));

                //eb:Contact
                //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeDelivery/ram:ShipToTradeParty/ram:DefinedTradeContact/ram:PersonName
                stttp.getDefinedTradeContact().get(0)
                    .setPersonName(new TextType().withValue(address.getContact()));

                //eb:Address extension
                //TODO - no field in ZUGFeRD for that
              }

              //eb:Description
              //TODO - no field in ZUGFeRD for that
            }

            //eb:BillersOrderReference
            //TODO - Not in ZUGFeRD

            //eb:InvoiceRecipientsOrderReference
            if (!MappingFactory.MappingType.ZUGFeRD_EXTENDED_1p0.equals(mappingType)
                && item.getInvoiceRecipientsOrderReference() != null) {

              //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeAgreement/ram:BuyerOrderReferencedDocument
              ReferencedDocumentType bor = new ReferencedDocumentType();
              scta.withBuyerOrderReferencedDocument(bor);

              //eb:OrderID
              //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeAgreement/ram:BuyerOrderReferencedDocument/ram:OrderID
              if (item.getInvoiceRecipientsOrderReference().getOrderID() != null) {
                bor.withID(
                    new IDType().withValue(item.getInvoiceRecipientsOrderReference().getOrderID()));
              }

              //eb:OrderPositionNumber
              //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeAgreement/ram:BuyerOrderReferencedDocument/ram:LineID
              if (item.getInvoiceRecipientsOrderReference().getOrderPositionNumber() != null) {
                bor.withLineID(
                    new IDType().withValue(
                        item.getInvoiceRecipientsOrderReference().getOrderPositionNumber()));
              }

              //eb:ReferenceDate
              //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeAgreement/ram:BuyerOrderReferencedDocument/ram:IssueDateTime
              if (item.getInvoiceRecipientsOrderReference().getReferenceDate() != null) {
                bor.withIssueDateTime(dateTimeFormatter
                                          .print(
                                              item.getInvoiceRecipientsOrderReference()
                                                  .getReferenceDate()));
              }
            }

            //eb:AdditionalInformation
            //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedTradeProduct/ram:ApplicableProductCharacteristic
            if (!MappingFactory.MappingType.ZUGFeRD_EXTENDED_1p0.equals(mappingType)
                && item.getAdditionalInformation() != null) {
              AdditionalInformation ai = item.getAdditionalInformation();

              String typeCode, description, unitCode, value;
              BigDecimal valueMeasure = null;

              //ed:SerialNumber
              if (ai.getSerialNumbers() != null && ai.getSerialNumbers().size() > 0) {
                for (String sn : ai.getSerialNumbers()) {
                  typeCode = "SERIAL_NUMBER";
                  description = "Seriennummer";
                  valueMeasure = null;
                  unitCode = null;
                  value = sn;

                  stp.withApplicableProductCharacteristic(
                      getApplicableProductCharacteristic(typeCode, description, valueMeasure,
                                                         unitCode, value));
                }
              }

              //ed:ChargeNumber
              if (ai.getChargeNumbers() != null && ai.getChargeNumbers().size() > 0) {
                for (String ch : ai.getChargeNumbers()) {
                  typeCode = "LOT_NUMBER";
                  description = "Chargennummer";
                  valueMeasure = null;
                  unitCode = null;
                  value = ch;

                  stp.withApplicableProductCharacteristic(
                      getApplicableProductCharacteristic(typeCode, description, valueMeasure,
                                                         unitCode, value));
                }
              }

              //ed:Classifications
              if (ai.getClassifications() != null && ai.getClassifications().size() > 0) {
                for (Classification cl : ai.getClassifications()) {
                  //TODO - Classifications can't be mapped to a typeCode, OTHER is not documented and now a placeholder
                  typeCode = "OTHER";
                  description = cl.getClassificationSchema();
                  valueMeasure = null;
                  unitCode = null;
                  value = cl.getValue();

                  stp.withApplicableProductCharacteristic(
                      getApplicableProductCharacteristic(typeCode, description, valueMeasure,
                                                         unitCode, value));
                }
              }

              //ed:AlternativeQuantity
              if (ai.getAlternativeQuantity() != null) {
                //TODO - AlternativeQuantity can't be mapped to a typeCode, ALTERNATIVE_QUANTITY is not documented and now a placeholder
                typeCode = "ALTERNATIVE_QUANTITY";
                description = "Alternative Quantity";
                valueMeasure = ai.getAlternativeQuantity().getValue();
                unitCode = ai.getAlternativeQuantity().getUnit();
                value = null;

                stp.withApplicableProductCharacteristic(
                    getApplicableProductCharacteristic(typeCode, description, valueMeasure,
                                                       unitCode, value));

              }
            }

            //Add SupplyChainTradeLineItem to SupplyChainTradeLineItem list
            listSCTLI.add(sctli);
          }
        }
      }

      //Add SupplyChainTradeLineItems (List) to ZUGFeRD
      zugferd.getSpecifiedSupplyChainTradeTransaction()
          .withIncludedSupplyChainTradeLineItem(listSCTLI);
    }
  }

  /**
   * Map the attributes from the ebInterface ROOT element
   */
  private void mapRootAttributes(CrossIndustryDocumentType zugferd, Invoice invoice) {
    //ZUGFeRD type
    String zugFeRDType = getZUGfeRDType();
    zugferd.getSpecifiedExchangedDocumentContext().withGuidelineSpecifiedDocumentContextParameter(
        new DocumentContextParameterType().withID(new IDType().withValue(zugFeRDType)));

    //eb:Generating system
    //TODO

    //eb:Document type
    //rsm:CrossIndustryDocument/rsm:HeaderExchangedDocument/ram:Name
    String documentType = getDocumentType(invoice);
    zugferd.getHeaderExchangedDocument().withName(new TextType().withValue(documentType));

    //eb:Document type code
    //rsm:CrossIndustryDocument/rsm:HeaderExchangedDocument/ram:TypeCode
    String typeCode = getDocumentTypeCode(invoice);
    zugferd.getHeaderExchangedDocument().withTypeCode(new DocumentCodeType().withValue(typeCode));

    //eb:Currency
    //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeSettlement/ram:InvoiceCurrencyCode
    String documentCurrency = invoice.getInvoiceCurrency().value();
    zugferd.getSpecifiedSupplyChainTradeTransaction().getApplicableSupplyChainTradeSettlement()
        .withInvoiceCurrencyCode(new CodeType().withValue(documentCurrency));

    //eb:ManualProcessing
    //TODO not found in ZUGFeRD

    //eb:DocumentTitle
    //TODO not found in ZUGFeRD

    if (MappingFactory.MappingType.ZUGFeRD_COMFORT_1p0.equals(mappingType)) {
      //eb:Language
      //rsm:CrossIndustryDocument/rsm:HeaderExchangedDocument/ram:LanguageID
      zugferd.getHeaderExchangedDocument().getLanguageID()
          .add(new IDType().withValue(ISO639ConversionUtil.convertISO639_2ToISO639_1(
              invoice.getLanguage().value())));
    }

    if (MappingFactory.MappingType.ZUGFeRD_COMFORT_1p0.equals(mappingType)) {
      //eb:IsDuplicate
      //rsm:CrossIndustryDocument/rsm:HeaderExchangedDocument/ram:CopyIndicator
      if (BooleanUtils.isTrue(invoice.getIsDuplicate())) {
        zugferd.getHeaderExchangedDocument()
            .withCopyIndicator(new IndicatorType().withIndicator(Boolean.TRUE));
      }

      //eb:Invoice number
      //rsm:CrossIndustryDocument/rsm:HeaderExchangedDocument/ram:ID
      zugferd.getHeaderExchangedDocument().withID(
          new IDType().withValue(invoice.getInvoiceNumber()));

      //eb:Invoice date
      //rsm:CrossIndustryDocument/rsm:HeaderExchangedDocument/ram:IssueDateTime
      zugferd.getHeaderExchangedDocument().withIssueDateTime(new DateTimeType().withDateTimeString(
          new DateTimeType.DateTimeString().withFormat("102")
              .withValue(dateTimeFormatter.print(invoice.getInvoiceDate()))));
    }
  }

  /**
   * Map the signature from the ebInterface
   */
  private void mapSignature(CrossIndustryDocumentType zugferd, Signature signature) {
    //TODO not supported in ZUGFeRD
  }

  /**
   * Map the ordering party Target in ZUGFeRD: rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeAgreement/ram:ProductEndUserTradeParty
   */
  private void mapOrderingParty(CrossIndustryDocumentType zugferd, OrderingParty orderingParty) {
    if (MappingFactory.MappingType.ZUGFeRD_EXTENDED_1p0.equals(mappingType)) {
      if (orderingParty == null) {
        LOG.debug("No biller element specified in ebInterface - continuing.");
        return;
      }

      //Create a trade party for the invoice recipient
      TradePartyType productEndUserTradeParty = new TradePartyType();
      SupplyChainTradeAgreementType
          supplyChainTradeAgreementType =
          getSupplyChainTradeAgreement(zugferd);
      supplyChainTradeAgreementType.withProductEndUserTradeParty(productEndUserTradeParty);

      //eb:VATIdentification
      productEndUserTradeParty.withSpecifiedTaxRegistration(new TaxRegistrationType().withID(
          new IDType().withValue(orderingParty.getVATIdentificationNumber()).withSchemeID("VA")));

      //eb:FurtherIdentification
      if (!MappingFactory.MappingType.ZUGFeRD_BASIC_1p0.equals(mappingType)
          && orderingParty.getFurtherIdentifications() != null
          && orderingParty.getFurtherIdentifications().size() > 0) {

        for (FurtherIdentification furtherIdentification : orderingParty
            .getFurtherIdentifications()) {
          productEndUserTradeParty
              .withID(new IDType().withValue(furtherIdentification.getValue()).withSchemeID(
                  furtherIdentification.getIdentificationType()));
        }

        //eb:InvoiceRecipient/Address/Addressidentifier/@AddressIdentifierType=(GLN, DUNS)
        //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeAgreement/BuyerTradeParty/GlobalID
        if (orderingParty.getAddress().getAddressIdentifiers().get(0) != null) {
          String schema = null;
          if (orderingParty.getAddress().getAddressIdentifiers().get(0).getAddressIdentifierType()
              .equals(AddressIdentifierTypeType.DUNS)) {
            schema = "0060";
          } else if (orderingParty.getAddress().getAddressIdentifiers().get(0)
              .getAddressIdentifierType()
              .equals(AddressIdentifierTypeType.GLN)) {
            schema = "0088";
          }
          if (schema != null) {
            productEndUserTradeParty.withGlobalID(
                new IDType().withValue(
                    orderingParty.getAddress().getAddressIdentifiers().get(0).getValue())
                    .withSchemeID(schema));
          }
        }
      }

      //OrderReference
      //TODO

      //eb:Address
      String lineOne = "";
      if (orderingParty.getAddress().getStreet() != null) {
        lineOne = orderingParty.getAddress().getStreet();
      } else {
        lineOne = orderingParty.getAddress().getPOBox();
      }

      productEndUserTradeParty.withName(
          new TextType().withValue(orderingParty.getAddress().getName()));
      productEndUserTradeParty.withPostalTradeAddress(
          new TradeAddressType()
              .withPostcodeCode(
                  new CodeType().withValue(orderingParty.getAddress().getZIP()))
              .withLineOne(new TextType().withValue(lineOne))
              .withLineTwo(
                  new TextType().withValue(orderingParty.getAddress().getContact()))
              .withCityName(
                  new TextType().withValue(orderingParty.getAddress().getTown()))
              .withCountryID(new CountryIDType().withValue(
                  orderingParty.getAddress().getCountry().getCountryCode().value())));

      //eb:BillersInvoiceRecipientID
      if (!Strings.isNullOrEmpty(orderingParty.getBillersOrderingPartyID())) {
        productEndUserTradeParty.withID(
            new IDType().withValue(orderingParty.getBillersOrderingPartyID()).withSchemeID(
                "Rechnungsempfänger-ID des Rechnungsstellers"));
      }
    }
  }

  /**
   * Map the invoice recipient Target in ZUGFeRD: rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeAgreement/ram:BuyerTradeParty
   */
  private void mapInvoiceRecipient(CrossIndustryDocumentType zugferd,
                                   InvoiceRecipient invoiceRecipient) {

    if (invoiceRecipient == null) {
      LOG.debug("No biller element specified in ebInterface - continuing.");
      return;
    }

    //Create a trade party for the invoice recipient
    TradePartyType invoiceRecipientTradePartyType = new TradePartyType();
    SupplyChainTradeAgreementType
        supplyChainTradeAgreementType =
        getSupplyChainTradeAgreement(zugferd);
    supplyChainTradeAgreementType.withBuyerTradeParty(invoiceRecipientTradePartyType);

    //eb:VATIdentification
    invoiceRecipientTradePartyType.withSpecifiedTaxRegistration(new TaxRegistrationType().withID(
        new IDType().withValue(invoiceRecipient.getVATIdentificationNumber()).withSchemeID("VA")));

    //eb:FurtherIdentification
    if (!MappingFactory.MappingType.ZUGFeRD_BASIC_1p0.equals(mappingType)
        && invoiceRecipient.getFurtherIdentifications() != null
        && invoiceRecipient.getFurtherIdentifications().size() > 0) {

      for (FurtherIdentification furtherIdentification : invoiceRecipient
          .getFurtherIdentifications()) {
        invoiceRecipientTradePartyType
            .withID(new IDType().withValue(furtherIdentification.getValue()).withSchemeID(
                furtherIdentification.getIdentificationType()));
      }

      //eb:InvoiceRecipient/Address/Addressidentifier/@AddressIdentifierType=(GLN, DUNS)
      //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeAgreement/BuyerTradeParty/GlobalID
      if (invoiceRecipient.getAddress().getAddressIdentifiers().get(0) != null) {
        String schema = null;
        if (invoiceRecipient.getAddress().getAddressIdentifiers().get(0).getAddressIdentifierType()
            .equals(AddressIdentifierTypeType.DUNS)) {
          schema = "0060";
        } else if (invoiceRecipient.getAddress().getAddressIdentifiers().get(0)
            .getAddressIdentifierType()
            .equals(AddressIdentifierTypeType.GLN)) {
          schema = "0088";
        }
        if (schema != null) {
          invoiceRecipientTradePartyType.withGlobalID(
              new IDType().withValue(
                  invoiceRecipient.getAddress().getAddressIdentifiers().get(0).getValue())
                  .withSchemeID(schema));
        }
      }
    }

    //OrderReference
    //TODO

    //eb:Address
    String lineOne = "";
    if (invoiceRecipient.getAddress().getStreet() != null) {
      lineOne = invoiceRecipient.getAddress().getStreet();
    } else {
      lineOne = invoiceRecipient.getAddress().getPOBox();
    }

    invoiceRecipientTradePartyType.withName(
        new TextType().withValue(invoiceRecipient.getAddress().getName()));
    invoiceRecipientTradePartyType.withPostalTradeAddress(
        new TradeAddressType()
            .withPostcodeCode(
                new CodeType().withValue(invoiceRecipient.getAddress().getZIP()))
            .withLineOne(new TextType().withValue(lineOne))
            .withLineTwo(
                new TextType().withValue(invoiceRecipient.getAddress().getContact()))
            .withCityName(
                new TextType().withValue(invoiceRecipient.getAddress().getTown()))
            .withCountryID(new CountryIDType().withValue(
                invoiceRecipient.getAddress().getCountry().getCountryCode().value())));

    //eb:BillersInvoiceRecipientID
    if (!Strings.isNullOrEmpty(invoiceRecipient.getBillersInvoiceRecipientID())) {
      invoiceRecipientTradePartyType.withID(
          new IDType().withValue(invoiceRecipient.getBillersInvoiceRecipientID()).withSchemeID(
              "Rechnungsempfänger-ID des Rechnungsstellers"));
    }

    //eb:AccountingArea
    //TODO - no respective field

    //eb:SubOrganizationID
    //TODO - no respective field
  }

  /**
   * Map the biller Target in ZUGFeRD: //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeSettlement
   */
  private void mapTradeSettlement(CrossIndustryDocumentType zugferd, Invoice invoice) {
    SupplyChainTradeSettlementType
        sctst =
        zugferd.getSpecifiedSupplyChainTradeTransaction().getApplicableSupplyChainTradeSettlement();

    //eb:PaymentReference
    //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeSettlement/ram:PaymentReference
    sctst.withPaymentReference(new TextType().withValue(
        invoice.getPaymentMethod().getUniversalBankTransaction().getPaymentReference().getValue()));

    //get zugferd currency
    String documentCurrency = sctst.getInvoiceCurrencyCode().getValue();

    TradeSettlementPaymentMeansType tspmt = new TradeSettlementPaymentMeansType();
    sctst.withSpecifiedTradeSettlementPaymentMeans(tspmt);

    //eb:?
    //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeSettlement/ram:SpecifiedTradeSettlementPaymentMeans/ID
    //TODO not in ebInvoice

    String paymentMethod = "";
    if (invoice.getPaymentMethod().getDirectDebit() != null) {
      paymentMethod = "49";
    } else if (invoice.getPaymentMethod().getUniversalBankTransaction() != null) {
      paymentMethod = "31";
    } else {
      paymentMethod = "1";
    }

    //eb:UniversalBankTransaction / eb:DirectDebit
    if (!MappingFactory.MappingType.ZUGFeRD_BASIC_1p0.equals(mappingType)) {
      //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeSettlement/ram:SpecifiedTradeSettlementPaymentMeans/TypeCode
      tspmt.withTypeCode(new PaymentMeansCodeType().withValue(paymentMethod));

      //eb:Comment
      //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeSettlement/ram:SpecifiedTradeSettlementPaymentMeans/Information
      tspmt.withInformation(new TextType().withValue(invoice.getPaymentMethod().getComment()));

      if (paymentMethod.equals("49")) {
        //eb:?
        //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeSettlement/ram:SpecifiedTradeSettlementPaymentMeans/PayerPartyDebtorFinancialAccount
        //TODO not in ebInvoice

        //eb:?
        //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeSettlement/ram:SpecifiedTradeSettlementPaymentMeans/PayerSpecifiedDebtorFinancialInstitution
        //TODO not in ebInvoice
      }
    }

    if (paymentMethod.equals("31")
        && invoice.getPaymentMethod().getUniversalBankTransaction().getBeneficiaryAccounts().size()
           > 1) {
      //eb:UniversalBankTransaction
      //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeSettlement/ram:SpecifiedTradeSettlementPaymentMeans/PayeePartyCreditorFinancialAccount
      tspmt.withPayeePartyCreditorFinancialAccount(new CreditorFinancialAccountType()
                                                       .withIBANID(new IDType().withValue(
                                                           invoice.getPaymentMethod()
                                                               .getUniversalBankTransaction()
                                                               .getBeneficiaryAccounts().get(0)
                                                               .getIBAN()))
                                                       .withAccountName(new TextType().withValue(
                                                           invoice.getPaymentMethod()
                                                               .getUniversalBankTransaction()
                                                               .getBeneficiaryAccounts().get(0)
                                                               .getBankAccountOwner())));

      //eb:UniversalBankTransaction
      //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeSettlement/ram:SpecifiedTradeSettlementPaymentMeans/PayeeSpecifiedCreditorFinancialInstitution
      tspmt.withPayeeSpecifiedCreditorFinancialInstitution(new CreditorFinancialInstitutionType()
                                                               .withBICID(new IDType().withValue(
                                                                   invoice.getPaymentMethod()
                                                                       .getUniversalBankTransaction()
                                                                       .getBeneficiaryAccounts()
                                                                       .get(0).getBIC()))
                                                               .withName(new TextType().withValue(
                                                                   invoice.getPaymentMethod()
                                                                       .getUniversalBankTransaction()
                                                                       .getBeneficiaryAccounts()
                                                                       .get(0).getBankName())));

    }

    //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeSettlement/ram:ApplicableTradeTax
    if (invoice.getTax().getVAT().getVATItems().size() > 0) {

      for (VATItem vATItems : invoice.getTax().getVAT().getVATItems()) {

        TradeTaxType tradeTaxType = new TradeTaxType();

        //eb:Amount
        tradeTaxType.withCalculatedAmount(
            new AmountType().withValue(vATItems.getAmount())
                .withCurrencyID(documentCurrency));

        //Tax type - always VAT in this case
        tradeTaxType.withTypeCode(new TaxTypeCodeType().withValue("VAT"));

        //eb:TaxedAmount
        tradeTaxType.withBasisAmount(new AmountType().withValue(vATItems.getTaxedAmount())
                                         .withCurrencyID(documentCurrency));

        //eb:VATRate
        if (vATItems.getVATRate() != null) {
          tradeTaxType.withApplicablePercent(
              new PercentType()
                  .withValue(vATItems.getVATRate().getValue()));
        }
      }
    }

    //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeSettlement/?
    //TODO set OtherTaxes proper
    if (invoice.getTax().getOtherTaxes().size() > 0) {

      for (OtherTax otherTax : invoice.getTax().getOtherTaxes()) {
                /*sctst.withApplicableTradeTax(new TradeTaxType()
                        .withCalculatedAmount(new AmountType().withValue(vATItems.getAmount()).withCurrencyID(documentCurrency))
                        .withTypeCode(new TaxTypeCodeType().withValue("VAT"))
                        .withBasisAmount(new AmountType().withValue(vATItems.getTaxedAmount()).withCurrencyID(documentCurrency))
                        .withApplicablePercent(new PercentType().withValue(vATItems.getVATRate().getValue())));*/
      }
    }

  }

  /**
   * Map the biller Target in ZUGFeRD: CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeAgreement/ram:SellerTradeParty
   */
  private void mapBiller(CrossIndustryDocumentType zugferd, Biller biller) {
    if (biller == null) {
      LOG.debug("No blller element specified in ebInterface - continuing.");
      return;
    }

    SupplyChainTradeAgreementType
        supplyChainTradeAgreementType =
        getSupplyChainTradeAgreement(zugferd);
    //CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeAgreement/SellerTradeParty
    TradePartyType sellerTradePartyType = new TradePartyType();
    supplyChainTradeAgreementType.withSellerTradeParty(sellerTradePartyType);

    //eb:VATIdentification
    sellerTradePartyType.withSpecifiedTaxRegistration(new TaxRegistrationType().withID(
        new IDType().withValue(biller.getVATIdentificationNumber()).withSchemeID("VA")));

    if (!MappingFactory.MappingType.ZUGFeRD_BASIC_1p0.equals(mappingType)) {
      //eb:Biller/Address/Addressidentifier/@AddressIdentifierType
      //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeAgreement/SellerTradeParty/GlobalID
      if (biller.getAddress().getAddressIdentifiers().get(0) != null) {
        String schema = null;
        if (biller.getAddress().getAddressIdentifiers().get(0).getAddressIdentifierType()
            .equals(AddressIdentifierTypeType.DUNS)) {
          schema = "0060";
        } else if (biller.getAddress().getAddressIdentifiers().get(0).getAddressIdentifierType()
            .equals(AddressIdentifierTypeType.GLN)) {
          schema = "0088";
        }
        if (schema != null) {
          sellerTradePartyType.withGlobalID(
              new IDType().withValue(biller.getAddress().getAddressIdentifiers().get(0).getValue())
                  .withSchemeID(schema));
        }

        //eb:OrderReference
        //CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeAgreement/BuyerReference
        if (biller.getOrderReference().getOrderID() != null) {
          supplyChainTradeAgreementType
              .withBuyerReference(new TextType().withValue(biller.getOrderReference().getOrderID()));
        }
      }

      //eb:Address
      String lineOne = "";
      if (biller.getAddress().getStreet() != null) {
        lineOne = biller.getAddress().getStreet();
      } else {
        lineOne = biller.getAddress().getPOBox();
      }

      sellerTradePartyType.withName(new TextType().withValue(biller.getAddress().getName()));
      sellerTradePartyType.withPostalTradeAddress(
          new TradeAddressType()
              .withPostcodeCode(new CodeType().withValue(biller.getAddress().getZIP()))
              .withLineOne(new TextType().withValue(lineOne))
              .withLineTwo(new TextType().withValue(biller.getAddress().getContact()))
              .withCityName(new TextType().withValue(biller.getAddress().getTown()))
              .withCountryID(new CountryIDType().withValue(
                  biller.getAddress().getCountry().getCountryCode().value())));
    }

    if (!MappingFactory.MappingType.ZUGFeRD_BASIC_1p0.equals(mappingType)) {
      //eb:Biller/InvoiceRecipientsBillerID
      //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeAgreement/SellerTradeParty/ID
      if (biller.getInvoiceRecipientsBillerID() != null) {
        sellerTradePartyType.withID(new IDType().withValue(biller.getInvoiceRecipientsBillerID()));
      }
    }
  }

  /**
   * Map the details of related documents Target in ZUGFeRD: rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeAgreement/ram:AdditionalReferencedDocument
   */
  private void mapRelatedDocuments(CrossIndustryDocumentType zugferd,
                                   List<RelatedDocument> relatedDocuments) {
    if (Iterables.isEmpty(relatedDocuments)) {
      LOG.debug("No related documents specified in ebInterface - continuing");
      return;
    }

    SupplyChainTradeAgreementType
        supplyChainTradeAgreementType =
        getSupplyChainTradeAgreement(zugferd);

    for (RelatedDocument relatedDocument : relatedDocuments) {

      if (MappingFactory.MappingType.ZUGFeRD_EXTENDED_1p0.equals(mappingType)) {
        //Create a new related document type and assign it to the supply chain trade agreement

        ReferencedDocumentType referencedDocumentType = new ReferencedDocumentType();
        supplyChainTradeAgreementType.getAdditionalReferencedDocument().add(referencedDocumentType);

        //eb:InvoiceNumber
        //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeAgreement/ram:AdditionalReferencedDocument/ram:ID
        referencedDocumentType.withID(new IDType().withValue(relatedDocument.getInvoiceNumber()));

        //eb:InvoiceDate
        //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeAgreement/ram:AdditionalReferencedDocument/ram:IssueDateTime
        referencedDocumentType.withIssueDateTime(
            dateTimeFormatter.print(relatedDocument.getInvoiceDate()));

        //eb:Document type
        //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeAgreement/ram:AdditionalReferencedDocument/ram:TypeCode
        //OI = Reference number identifying a previously issued invoice. (http://www.unece.org/trade/untdid/i98a/uncl/uncl1153.htm)
        referencedDocumentType.withTypeCode(
            new DocumentCodeType().withValue("OI"));

        //eb:Comment
        //TODO - not really an element in ZUGFeRD which fits here...
      } else {
        StringBuilder text = new StringBuilder();

        text.append("Zugehörige Rechnung:\n");

        if (relatedDocument.getInvoiceNumber() != null) {
          text.append(relatedDocument.getInvoiceNumber());
        }

        if (relatedDocument.getInvoiceDate() != null) {
          text.append(dateTimeFormatter.print(relatedDocument.getInvoiceDate())).append("\n");
        }
        if (relatedDocument.getComment() != null) {
          text.append(relatedDocument.getComment());
        }

        zugferd.getHeaderExchangedDocument().getIncludedNote()
            .add(new NoteType().withContent(new TextType().withValue(text.toString())));
      }
    }
  }

  /**
   * Map the details of the cancelled document Target in ZUGFeRD: TODO
   */
  private void mapCancelledOriginalDocument(CrossIndustryDocumentType zugferd,
                                            CancelledOriginalDocument cancelledOriginalDocument) {

    if (cancelledOriginalDocument == null) {
      LOG.debug("No cancelled original document specified in ebInterface - continuing");
      return;
    }

    if (MappingFactory.MappingType.ZUGFeRD_EXTENDED_1p0.equals(mappingType)) {
      SupplyChainTradeAgreementType
          supplyChainTradeAgreementType =
          getSupplyChainTradeAgreement(zugferd);

      //Create a new related document type and assign it to the supply chain trade agreement
      ReferencedDocumentType referencedDocumentType = new ReferencedDocumentType();
      supplyChainTradeAgreementType.getAdditionalReferencedDocument().add(referencedDocumentType);

      //eb:InvoiceNumber
      //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeAgreement/ram:AdditionalReferencedDocument/ram:ID
      referencedDocumentType
          .withID(new IDType().withValue(cancelledOriginalDocument.getInvoiceNumber()));

      //eb:InvoiceDate
      //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeAgreement/ram:AdditionalReferencedDocument/ram:IssueDateTime
      referencedDocumentType.withIssueDateTime(
          dateTimeFormatter.print(cancelledOriginalDocument.getInvoiceDate()));

      //eb:Document type
      //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeAgreement/ram:AdditionalReferencedDocument/ram:TypeCode
      //ACW = Reference number assigned to the message which was previously issued (e.g. in the case of a cancellation,
      //      the primary reference of the message to be cancelled will be quoted in this element). (http://www.unece.org/trade/untdid/i98a/uncl/uncl1153.htm)
      referencedDocumentType.withTypeCode(
          new DocumentCodeType().withValue("ACW"));

      //eb:Comment
      //TODO - not really an element in ZUGFeRD which fits here...

    } else {
      StringBuilder text = new StringBuilder();

      text.append("Stornierte Rechnung:\n");

      if (cancelledOriginalDocument.getInvoiceNumber() != null) {
        text.append(cancelledOriginalDocument.getInvoiceNumber());
      }

      if (cancelledOriginalDocument.getInvoiceDate() != null) {
        text.append(dateTimeFormatter.print(cancelledOriginalDocument.getInvoiceDate()))
            .append("\n");
      }
      if (cancelledOriginalDocument.getComment() != null) {
        text.append(cancelledOriginalDocument.getComment());
      }

      zugferd.getHeaderExchangedDocument().getIncludedNote()
          .add(new NoteType().withContent(new TextType().withValue(text.toString())));
    }
  }

  /**
   * Map the details of an ebInterface delivery element Target in ZUGFeRD:
   * rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeDelivery/ram:ShipToTradeParty
   */
  private void mapDelivery(CrossIndustryDocumentType zugferd, Delivery delivery) {

    if (delivery == null) {
      LOG.debug("No delivery element specified in ebInterface - continuing.");
      return;
    }

    //Create the necessary elements in ZUGFeRD
    zugferd.getSpecifiedSupplyChainTradeTransaction().withApplicableSupplyChainTradeDelivery(
        new SupplyChainTradeDeliveryType().withShipToTradeParty(new TradePartyType()));

    if (!MappingFactory.MappingType.ZUGFeRD_BASIC_1p0.equals(mappingType)
        && delivery.getDeliveryID() != null) {
      //eb:DeliveryID
      //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeDelivery/ram:DespatchAdviceReferencedDocument/ram:ID
      zugferd.getSpecifiedSupplyChainTradeTransaction().getApplicableSupplyChainTradeDelivery()
          .withDeliveryNoteReferencedDocument(
              new ReferencedDocumentType()
                  .withID(new IDType().withValue(delivery.getDeliveryID())));
    }

    //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeDelivery/ram:ActualDeliverySupplyChainEvent/ram:OccurrenceDateTime/udt:DateTimeString
    if (delivery.getDate() != null) {
      //eb:Delivery/Date
      zugferd.getSpecifiedSupplyChainTradeTransaction().getApplicableSupplyChainTradeDelivery()
          .withActualDeliverySupplyChainEvent(new SupplyChainEventType().withOccurrenceDateTime(
              new DateTimeType().withDateTimeString(new DateTimeType.DateTimeString().withValue(
                  dateTimeFormatter.print(delivery.getDate())).withFormat(
                  "102"))));
    }else if (delivery.getPeriod().getFromDate() != null){
      //eb:Delivery/Period/FromDate
      zugferd.getSpecifiedSupplyChainTradeTransaction().getApplicableSupplyChainTradeDelivery()
          .withActualDeliverySupplyChainEvent(new SupplyChainEventType().withOccurrenceDateTime(
              new DateTimeType().withDateTimeString(new DateTimeType.DateTimeString().withValue(
                  dateTimeFormatter.print(delivery.getPeriod().getFromDate())).withFormat(
                  "102"))));
    }

    if (MappingFactory.MappingType.ZUGFeRD_EXTENDED_1p0.equals(mappingType)) {
      //Process address details, in case there's one
      if (delivery.getAddress() != null) {

        //Create the necessary elements in ZUGFeRD
        zugferd.getSpecifiedSupplyChainTradeTransaction().getApplicableSupplyChainTradeDelivery()
            .getShipToTradeParty().withDefinedTradeContact(new TradeContactType());
        zugferd.getSpecifiedSupplyChainTradeTransaction().getApplicableSupplyChainTradeDelivery()
            .getShipToTradeParty().withPostalTradeAddress(new TradeAddressType());

        Address address = delivery.getAddress();

        String partyName = "";
        //Build the person name string
        if (!Strings.isNullOrEmpty(address.getSalutation())) {
          partyName += address.getSalutation() + " ";
        }
        if (!Strings.isNullOrEmpty(address.getName())) {
          partyName += address.getName();
        }

        //eb:Salutation and Name
        //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeDelivery/ram:ShipToTradeParty/ram:Name
        zugferd.getSpecifiedSupplyChainTradeTransaction().getApplicableSupplyChainTradeDelivery()
            .getShipToTradeParty().withName(new TextType().withValue(partyName));

        //eb:Street
        //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeDelivery/ram:ShipToTradeParty/ram:PostalTradeAddress/ram:LineOne
        zugferd.getSpecifiedSupplyChainTradeTransaction().getApplicableSupplyChainTradeDelivery()
            .getShipToTradeParty().getPostalTradeAddress()
            .setLineOne(new TextType().withValue(address.getStreet()));

        //eb:Town
        //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeDelivery/ram:ShipToTradeParty/ram:PostalTradeAddress/ram:CityName
        zugferd.getSpecifiedSupplyChainTradeTransaction().getApplicableSupplyChainTradeDelivery()
            .getShipToTradeParty().getPostalTradeAddress()
            .setCityName(new TextType().withValue(address.getTown()));

        //eb:ZIP
        //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeDelivery/ram:ShipToTradeParty/ram:PostalTradeAddress/ram:PostcodeCode
        zugferd.getSpecifiedSupplyChainTradeTransaction().getApplicableSupplyChainTradeDelivery()
            .getShipToTradeParty().getPostalTradeAddress().getPostcodeCode()
            .add(new CodeType().withValue(address.getZIP()));

        //eb:Country Code
        //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeDelivery/ram:ShipToTradeParty/ram:PostalTradeAddress/ram:CountryID
        zugferd.getSpecifiedSupplyChainTradeTransaction().getApplicableSupplyChainTradeDelivery()
            .getShipToTradeParty().getPostalTradeAddress().setCountryID(
            new CountryIDType().withValue(address.getCountry().getCountryCode().value()));

        //eb:Phone
        //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeDelivery/ram:ShipToTradeParty/ram:DefinedTradeContact/ram:TelephoneUniversalCommunication/ram:CompleteNumber
        zugferd.getSpecifiedSupplyChainTradeTransaction().getApplicableSupplyChainTradeDelivery()
            .getShipToTradeParty().getDefinedTradeContact().get(0)
            .withTelephoneUniversalCommunication(
                new UniversalCommunicationType().withCompleteNumber(
                    new TextType().withValue(address.getPhone())));

        //eb:Email
        //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeDelivery/ram:ShipToTradeParty/ram:DefinedTradeContact/ram:EmailURIUniversalCommunication/ram:CompleteNumber
        zugferd.getSpecifiedSupplyChainTradeTransaction().getApplicableSupplyChainTradeDelivery()
            .getShipToTradeParty().getDefinedTradeContact().get(0)
            .withEmailURIUniversalCommunication(
                new UniversalCommunicationType().withCompleteNumber(
                    new TextType().withValue(address.getEmail())));

        //eb:Contact
        //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:ApplicableSupplyChainTradeDelivery/ram:ShipToTradeParty/ram:DefinedTradeContact/ram:PersonName
        zugferd.getSpecifiedSupplyChainTradeTransaction().getApplicableSupplyChainTradeDelivery()
            .getShipToTradeParty().getDefinedTradeContact().get(0)
            .setPersonName(new TextType().withValue(address.getContact()));

        //eb:Address extension
        //TODO - no field in ZUGFeRD for that
      }
    }

    //eb:Description
    //TODO - no field in ZUGFeRD for that
  }

  /**
   * Create an empty cross industry invoice, with the most important elements already added with
   * empty content
   */
  private CrossIndustryDocumentType getEmptyCrossIndustryDocumentType() {
    CrossIndustryDocumentType zugferd = new CrossIndustryDocumentType();

    zugferd.withSpecifiedExchangedDocumentContext(new ExchangedDocumentContextType());
    zugferd.withHeaderExchangedDocument(new ExchangedDocumentType());
    zugferd.withSpecifiedSupplyChainTradeTransaction(new SupplyChainTradeTransactionType()
                                                         .withApplicableSupplyChainTradeSettlement(
                                                             new SupplyChainTradeSettlementType()));

    return zugferd;
  }

  /**
   * Depending on the set document type in ebInterface, return the correct ZUGFeRD document type
   *
   * Valid values in ZUGFeRD are RECHNUNG, GUTSCHRIFT, BELASTUNGSANZEIGE, PROFORMARECHNUNG
   *
   * The following mapping scheme is applied <xs:enumeration value="CreditMemo"/> GUTSCHRIFT
   * <xs:enumeration value="FinalSettlement"/> RECHNUNG <xs:enumeration value="Invoice"/> RECHNUNG
   * <xs:enumeration value="InvoiceForAdvancePayment"/> RECHNUNG <xs:enumeration
   * value="InvoiceForPartialDelivery"/> RECHNUNG <xs:enumeration value="SelfBilling"/>
   * BELASTUNGSANZEIGE <xs:enumeration value="SubsequentCredit"/>          RECHNUNG <xs:enumeration
   * value="SubsequentDebit"/> RECHNUNG
   */
  private String getDocumentType(Invoice invoice) {

    if (DocumentTypeType.SELF_BILLING.equals(invoice.getDocumentType())) {
      return "BELASTUNGSANZEIGE";
    } else if (DocumentTypeType.CREDIT_MEMO.equals(invoice.getDocumentType())) {
      return "GUTSCHRIFT";
    } else {
      return "RECHNUNG";
    }

  }

  /**
   * Return the correct document type code. Valid document type codes in ZUGFeRD are 380, 84, 389
   */
  private String getDocumentTypeCode(Invoice invoice) {

    //Code 84 has no equivalent in ebInterface
    if (DocumentTypeType.SELF_BILLING.equals(invoice.getDocumentType())) {
      return "389";
    } else {
      return "380";
    }
  }


  /**
   * Return the correct identifier scheme of the given ZUGFeRD type
   */
  private String getZUGfeRDType() {

    if (MappingFactory.MappingType.ZUGFeRD_BASIC_1p0.equals(mappingType)) {
      return "urn:ferd:CrossIndustryDocument:invoice:1p0:basic";
    } else if (MappingFactory.MappingType.ZUGFeRD_COMFORT_1p0.equals(mappingType)) {
      return "urn:ferd:CrossIndustryDocument:invoice:1p0:comfort";
    } else {
      return "urn:ferd:CrossIndustryDocument:invoice:1p0:extended";
    }
  }

  /**
   * Get the supply chain trade agreement from ZUGFeRD. In case there's one, return the first one
   * found (we won't use multiple supply chain trade agreements in this mapping). Otherwise create a
   * new one and return it.
   */
  private SupplyChainTradeAgreementType getSupplyChainTradeAgreement(
      CrossIndustryDocumentType zugferd) {

    if (Iterables.isEmpty(zugferd.getSpecifiedSupplyChainTradeTransaction()
                              .getApplicableSupplyChainTradeAgreement())) {
      SupplyChainTradeAgreementType
          supplyChainTradeAgreementType =
          new SupplyChainTradeAgreementType();
      zugferd.getSpecifiedSupplyChainTradeTransaction().getApplicableSupplyChainTradeAgreement()
          .add(
              supplyChainTradeAgreementType);
      return supplyChainTradeAgreementType;
    } else {
      return zugferd.getSpecifiedSupplyChainTradeTransaction()
          .getApplicableSupplyChainTradeAgreement().get(0);
    }

  }

  private TradeAllowanceChargeType getTradeAllowanceCharge (boolean chargeIndicator, BigDecimal baseAmount, String documentCurrency, BigDecimal percentage,
                                                                BigDecimal amount, String comment) {
    //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeAgreement/ram:GrossPriceProductTradePrice/ram:ChargeAmount/ram:AppliedTradeAllowanceCharge
    TradeAllowanceChargeType atac = new TradeAllowanceChargeType();

    //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeAgreement/ram:GrossPriceProductTradePrice/ram:ChargeAmount/ram:AppliedTradeAllowanceCharge/ram:ChargeIndicator
    //surcharge: true
    //reduction: false
    atac.withChargeIndicator(new IndicatorType().withIndicator(chargeIndicator));

    if (MappingFactory.MappingType.ZUGFeRD_EXTENDED_1p0.equals(mappingType)) {
      if (baseAmount != null) {
        //eb:BaseAmount
        //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeAgreement/ram:GrossPriceProductTradePrice/ram:ChargeAmount/ram:AppliedTradeAllowanceCharge/ram:BasisAmount
        atac.withBasisAmount(
            new AmountType().withValue(baseAmount)
                .withCurrencyID(
                    documentCurrency));
      }

      if (percentage != null) {
        //eb:Percentage
        //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeAgreement/ram:GrossPriceProductTradePrice/ram:ChargeAmount/ram:AppliedTradeAllowanceCharge/ram:CalculationPercent
        atac.withCalculationPercent(
            new PercentType().withValue(percentage));
      }
    }

    if (amount != null) {
      //eb:Amount
      //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeAgreement/ram:GrossPriceProductTradePrice/ram:ChargeAmount/ram:AppliedTradeAllowanceCharge/ram:ActualAmount
      atac.withActualAmount(new AmountType().withValue(amount)
                                .withCurrencyID(
                                    documentCurrency));
    }

    if (comment != null) {
      //eb:Comment
      //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedSupplyChainTradeAgreement/ram:GrossPriceProductTradePrice/ram:ChargeAmount/ram:AppliedTradeAllowanceCharge/ram:Reason
      atac.withReason(new TextType().withValue(comment));
    }

    return atac;
  }

  private ProductCharacteristicType getApplicableProductCharacteristic (String typeCode, String description, BigDecimal valueMeasure, String unitCode, String value){
    //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedTradeProduct/ram:ApplicableProductCharacteristic
    ProductCharacteristicType pc = new ProductCharacteristicType();

    //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedTradeProduct/ram:ApplicableProductCharacteristic/ram:TypeCode
    if (typeCode != null) {
      pc.withTypeCode(new CodeType().withValue(typeCode));
    }

    //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedTradeProduct/ram:ApplicableProductCharacteristic/ram:Description
    if (description != null) {
      pc.withDescription(new TextType().withValue(description));
    }

    if (valueMeasure != null) {
      //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedTradeProduct/ram:ApplicableProductCharacteristic/ram:ValueMeasure
      MeasureType m = new MeasureType();

      m.withValue(valueMeasure);

      //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedTradeProduct/ram:ApplicableProductCharacteristic/ram:ValueMeasure/ram:unitCode
      if (unitCode != null){
        m.withUnitCode(unitCode);
      }

      pc.withValueMeasure(m);
    }

    //rsm:CrossIndustryDocument/rsm:SpecifiedSupplyChainTradeTransaction/ram:IncludedSupplyChainTradeLineItem/ram:SpecifiedTradeProduct/ram:ApplicableProductCharacteristic/ram:Value
    if (value != null) {
      pc.withValue(new TextType().withValue(value));
    }

    return pc;
  }
}