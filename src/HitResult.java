public class HitResult {
	private final int damageReceived;
	private final int reward;

	public HitResult(int damageReceived, int reward) {
		this.damageReceived = damageReceived;
		this.reward = reward;
	}

	public int getDamageReceived() {
		return damageReceived;
	}

	public int getReward() {
		return reward;
	}
}
