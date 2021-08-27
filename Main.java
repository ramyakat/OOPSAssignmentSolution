
public class Main {

	public static void main(String[] args) {
		SuperDepartment superDepartment = new SuperDepartment();
		AdminDepartment adminDepartment = new AdminDepartment();
		TechDepartemnt techDepartemnt = new TechDepartemnt();
		HRDepartment hrDepartment = new HRDepartment();

		System.out.println(adminDepartment.getDepartmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());
		System.out.println("\n");
		System.out.println(hrDepartment.getDepartmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.isTodayAHoliday());
		System.out.println("\n");
		System.out.println(techDepartemnt.getDepartmentName());
		System.out.println(techDepartemnt.getTodaysWork());
		System.out.println(techDepartemnt.getWorkDeadline());
		System.out.println(techDepartemnt.getTechStackInformation());
		System.out.println(techDepartemnt.isTodayAHoliday());

	}

}
