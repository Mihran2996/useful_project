package com.example.test.stub;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private ServiceList serviceList;

    //stub test@ menq ogtagorcumenq veradardznelov kexc tvyalner,stugumenq te mer grac logikan chishte ashxatum te che

    public Service(ServiceList serviceList) {
        this.serviceList = serviceList;
    }

    public List<String> getDataFromService() {
        List<String> strings = serviceList.getData();
        List<String> response = new ArrayList<>();
        for (String string : strings) {
            if (string.contains("P")) {
                response.add(string);
            }
        }
        return response;
    }

}
