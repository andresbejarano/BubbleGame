
public class Bubble {
	
	public static final int EASY = 1, NORMAL = 2, HARD = 3;
	
	private int posX;
	private int posY;
	private int vX;
	private int vY;
	private int d;
	private int score;
	private int rColor;
	private int gColor;
	private int bColor;
	
	/**
	 * 
	 * @param posX
	 * @param posY
	 * @param type
	 */
	public Bubble(int posX, int posY, int type) {
		this.posX = posX;
		this.posY = posY;
		switch(type) {
		case EASY:
			vX = vY = 1;
			d = 30;
			score = 1;
			rColor = 0;
			gColor = 255;
			bColor = 0;
			break;
		case NORMAL:
			vX = vY = 2;
			d = 25;
			score = 5;
			rColor = 0;
			gColor = 0;
			bColor = 255;
			break;
		case HARD:
			vX = vY = 3;
			d = 20;
			score = 10;
			rColor = 255;
			gColor = 0;
			bColor = 0;
			break;
		}
	}

	/**
	 * 
	 * @return
	 */
	public int getPosX() {
		return posX;
	}

	/**
	 * 
	 * @param posX
	 */
	public void setPosX(int posX) {
		this.posX = posX;
	}

	/**
	 * 
	 * @return
	 */
	public int getPosY() {
		return posY;
	}

	/**
	 * 
	 * @param posY
	 */
	public void setPosY(int posY) {
		this.posY = posY;
	}

	/**
	 * 
	 * @return
	 */
	public int getvX() {
		return vX;
	}

	/**
	 * 
	 * @param vX
	 */
	public void setvX(int vX) {
		this.vX = vX;
	}

	/**
	 * 
	 * @return
	 */
	public int getvY() {
		return vY;
	}

	/**
	 * 
	 * @param vY
	 */
	public void setvY(int vY) {
		this.vY = vY;
	}

	/**
	 * 
	 * @return
	 */
	public int getD() {
		return d;
	}

	/**
	 * 
	 * @param d
	 */
	public void setD(int d) {
		this.d = d;
	}
	
	/**
	 * 
	 */
	public void togglevX() {
		this.vX *= -1;
	}
	
	/**
	 * 
	 */
	public void togglevY() {
		this.vY *= -1;
	}

	/**
	 * 
	 * @return
	 */
	public int getScore() {
		return score;
	}

	/**
	 * 
	 * @param score
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * 
	 * @return
	 */
	public int getrColor() {
		return rColor;
	}

	/**
	 * 
	 * @param rColor
	 */
	public void setrColor(int rColor) {
		this.rColor = rColor;
	}

	/**
	 * 
	 * @return
	 */
	public int getgColor() {
		return gColor;
	}

	/**
	 * 
	 * @param gColor
	 */
	public void setgColor(int gColor) {
		this.gColor = gColor;
	}

	/**
	 * 
	 * @return
	 */
	public int getbColor() {
		return bColor;
	}

	/**
	 * 
	 * @param bColor
	 */
	public void setbColor(int bColor) {
		this.bColor = bColor;
	}
	
}
