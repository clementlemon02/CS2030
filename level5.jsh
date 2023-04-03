ImList<Service> serveCruises(ImList<Cruise> cruises) {
    int MAINTAINENCE_TIME = 60;
    ImList<Service> active = new ImList<Service>();
    ImList<Service> expired = new ImList<Service>();
    ImList<Loader> loaders = new ImList<Loader>();
    ImList<Service> schedule = new ImList<Service>();


    for (Cruise cruise : cruises) {
        int j = 0;
        while (j < active.size()) {
            if (active.get(j).getServiceEndTime() <= cruise.getArrivalTime()) {
                expired = expired.add(active.get(j));
                //System.out.println(active.get(j).getServiceEndTime());
                active = active.remove(j);
                //System.out.println(expired);
                //System.out.println(active.get(j).getServiceEndTime());
            } else {
                j = j + 1;
            }
        }


        for (int i = 0; i < cruise.getNumOfLoadersRequired(); i = i + 1) {
            if (!expired.isEmpty()){
                if (expired.get(0).getLoader().getId() % 3 == 0) {
                    Service newService = new Service(expired.get(0).getLoader(),cruise.addServiceTime(MAINTAINENCE_TIME));
                    //System.out.println(newService.getServiceEndTime());
                    active = active.add(newService);
                    expired = expired.remove(0);
                    schedule = schedule.add(newService);
                } else {
                    Service newService = new Service(expired.get(0).getLoader(),cruise);
                    //System.out.println(newService.getServiceEndTime());
                    active = active.add(newService);
                    expired = expired.remove(0);
                    schedule = schedule.add(newService);
                }
            } else {
                if ((loaders.size() + 1)  % 3 == 0) {
                    Loader newLoader = new RecycledLoader(loaders.size() + 1);
                    loaders = loaders.add(newLoader);
                    Service newService = new Service(newLoader, cruise.addServiceTime(MAINTAINENCE_TIME));
                    active = active.add(newService);
                    schedule = schedule.add(newService);
                } else {
                    Loader newLoader = new Loader(loaders.size() + 1);
                    loaders = loaders.add(newLoader);
                    Service newService = new Service(newLoader, cruise);
                    active = active.add(newService);
                    schedule = schedule.add(newService);
                }

            } 
        }
    }
    return schedule;
}
