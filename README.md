# ATU-LYIT-Electric
Electricity supply company

LYIT Electric is an electricity supply company that has 2 types of customers: Residential and Business.
It issues an electric bill to its customers every month totalling the charges for the number of Units
used plus a Standing charge fee. VAT is calculated on this total and added to the bill. LYIT Electric
applies the following rates to customers in calculating the bill.

## Unit Charges

**Residential customer**
* Up to 200 units 18 cents per unit
* Over 200 units 23 cents per unit
* As a special January offer any customer that is with the company for more than 3 years will get the first 200 units for free (0.00 cents)

**Business customer**
* Business customers are charged 25 cents per unit regardless of the number of units used

## Standing Charges

**Residential customer** <br/>

Standing charges for Residential customers are based on the type of meter a customer has, Urban or Rural.
* Customers on an Urban meter pay €17.50 per month standing charge
* Customers on a Rural meter pay €21.50 per month.

**Business customer**
* All Business customers pay €20.00 standard standing charge per month

## VAT
* VAT is calculated on all electric bills at 13% (0.13) of the total amount (Units used + standing charge)

You are required to write a Java program to calculate cost of a customer’s electricity bill. Your
program should begin by prompting the user to enter the type of customer, Residential (R) or
Business (B). The user should then be asked to enter the number of units used, the type of meter
the customer has, Urban (U) or Rural (R) and the number of years with the company, as applicable.
Business customers can have more than one business connected to one electric bill. Business
customers should be asked to enter the number of businesses they have and enter the number of
units used for each business in turn before calculating a final bill.
