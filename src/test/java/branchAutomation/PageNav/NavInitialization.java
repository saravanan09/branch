package branchAutomation.PageNav;



public class NavInitialization {


	public static LoginPageNav LoginPage(){
		LoginPageNav loginNav = new LoginPageNav();
		return loginNav;
	}
	
	public static DashboardPageNav DashboardPage(){
		DashboardPageNav dashboardNav = new DashboardPageNav();
		return dashboardNav;
	}
	
	public static BranchAPI api(){
		BranchAPI apiAccess = new BranchAPI();
		return apiAccess;
	}
}
