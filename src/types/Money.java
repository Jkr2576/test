package types;

import interfaces.IMoney;

/**
 * Значения реквизитов с деньгами
 * 
 * @author Сахончик Д.В.
 */
public class Money implements IMoney {
	/**
	 * выплаты по пачке
	 */
	public String vpl;
	/**
	 * пособий/взносов по пачке
	 */
	public String bln;
	/**
	 * страховых/уплаченых взносов по пачке
	 */
	public String vzn;

	public Money(String[] arg) {
		this.vpl = arg[0];
		this.bln = arg[1];
		this.vzn = arg[2];
	}

	/**
	 * Подсчет реальных сумм
	 */
	public void add(Money money) {
		try {
			this.vpl = Long.toString(Long.parseLong(this.vpl)
					+ Integer.parseInt(money.vpl));
		} catch (NumberFormatException e) {
		}
		try {
			this.vzn = Long.toString(Long.parseLong(this.vzn)
					+ Integer.parseInt(money.vzn));
		} catch (NumberFormatException e) {
		}
		try {
			this.bln = Long.toString(Long.parseLong(this.bln)
					+ Integer.parseInt(money.bln));
		} catch (NumberFormatException e) {
		}

	}

	public void clear() {
		this.vpl = "0";
		this.bln = "0";
		this.vzn = "0";
	}

}
