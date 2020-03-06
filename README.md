# Basics

    List<String> source=new ArrayList<String>();
        source.add("1");
        source.add("2");
        source.add("3");
        source.add("4");
        source.add("5");

        List<String> destination=new ArrayList<String>();
        destination.add("1");
        destination.add("2");
        destination.add("3");
        destination.add("4");
        destination.add("5");
        System.out.println(destination.stream().allMatch(num -> source.contains(num)) &&source.stream().allMatch(num->destination.contains(num))); 
