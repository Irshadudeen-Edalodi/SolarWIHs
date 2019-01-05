package com.irshad;

import java.util.HashMap;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;

public class GetElectricStatusWIH implements WorkItemHandler {

	public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
		// TODO Auto-generated method stub
		HttpsClientSolar hcs =new HttpsClientSolar();
		String response = null;
		try {
			response = hcs.sendGetElectricStatusRequest();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HashMap<String,Object> results = new HashMap<String, Object>();
		results.put("electricStatus", response);
		manager.completeWorkItem(workItem.getId(), results);
		
	}

	public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {
		// TODO Auto-generated method stub
		
	}

}
