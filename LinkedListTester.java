package processor;

class LinkedListTester {
	public static void main(String[] args) {
        LinkedList datalist = new LinkedList();
        datalist.construct("data.txt");
        datalist.process();
        datalist.printToFile("processed.txt");
	}

}
