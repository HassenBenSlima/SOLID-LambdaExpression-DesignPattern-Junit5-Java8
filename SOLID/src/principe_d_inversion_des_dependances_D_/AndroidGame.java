package principe_d_inversion_des_dependances_D_;

public class AndroidGame {

	private API api;

	public AndroidGame(API api) {
		super();
		this.setApi(api);
	}

	public API getApi() {
		return api;
	}

	public void setApi(API api) {
		this.api = api;
	}

}
