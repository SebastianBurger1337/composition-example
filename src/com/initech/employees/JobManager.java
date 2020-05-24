package com.initech.employees;

public class JobManager {



	public static void main(String[] args)
	{
		Janitor janitor = new Janitor();
		OfficeWorker officeWorker = new OfficeWorker();

		janitor.clean();
		officeWorker.work();
	}

}
