package util;

public class ActivityCostConfig {
	
	private String logEvent;
	private String action;
	private float cost;
	
	public ActivityCostConfig() {
		
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public void setLogEvent(String logEvent) {
		if(logEvent == null) this.logEvent = "";
		else this.logEvent = logEvent;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public float getCost() {
		return cost;
	}
	public String getLogEvent() {
		return logEvent;
	}
	public String getAction() {
		return action;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null) return false;
		if(!(obj instanceof ActivityCostConfig)) return false;
		ActivityCostConfig acc = (ActivityCostConfig) obj;
		return acc.getLogEvent().equals(this.logEvent) &&
				acc.getAction().equals(this.action);
	}

}
