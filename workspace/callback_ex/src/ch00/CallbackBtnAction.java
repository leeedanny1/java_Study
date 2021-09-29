package ch00;

// 인터페이스
public interface CallbackBtnAction {

	public abstract void clickedAddBtn();
	public abstract void clickedMinusBtn();
	public abstract void passValue(int value);
}
