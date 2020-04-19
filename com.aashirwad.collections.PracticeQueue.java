package com.aashirwad.collections;

import com.aashirwad.enums.SupportCategory;
import com.aashirwad.models.Customer;
import com.aashirwad.utils.CategorisedHelpDesk;
import com.aashirwad.utils.HelpDesk;
import com.aashirwad.utils.PriorityHelpDesk;

public class PracticeQueue {
	
	public static void main(String[] args) {
		
		PriorityHelpDesk helpDesk = new PriorityHelpDesk();
		
		helpDesk.enquire(Customer.AASHIRWAD, SupportCategory.COMPUTER);
		helpDesk.enquire(Customer.AKANKSHA, SupportCategory.MOBILE);
		helpDesk.enquire(Customer.AMAN, SupportCategory.PRINTER);
		
		helpDesk.processAllEnquiries();
	}
	
	public static void main_CategorisedHelpDesk(String[] args) {
		
		CategorisedHelpDesk helpDesk = new CategorisedHelpDesk();
		
		helpDesk.enquire(Customer.AASHIRWAD, SupportCategory.COMPUTER);
		helpDesk.enquire(Customer.AKANKSHA, SupportCategory.MOBILE);
		helpDesk.enquire(Customer.AMAN, SupportCategory.PRINTER);
		
		// Categorised HelpDesk
		helpDesk.processPrinterEnquiriesRemove();
		helpDesk.processGeneralEnquiriesRemove();
		helpDesk.processPrinterEnquiriesJava8Way();
		helpDesk.processGeneralEnquiriesJava8Way();
		helpDesk.processPrinterEnquiriesRemove();
		helpDesk.processGeneralEnquiriesRemove();
		helpDesk.processPrinterEnquiriesJava8Way();
	}
	
	public static void main_HelpDesk(String[] args) {
		HelpDesk helpDesk = new HelpDesk();
		
		helpDesk.enquire(Customer.AASHIRWAD, SupportCategory.COMPUTER);
		helpDesk.enquire(Customer.AKANKSHA, SupportCategory.MOBILE);
		helpDesk.enquire(Customer.AMAN, SupportCategory.PRINTER);
		
		helpDesk.processAllEnquiriesRemove();
		helpDesk.processAllEnquiriesPoll();
		
	}	

}
