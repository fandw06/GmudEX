/**
 * 安卓白金英雄坛制作组 <p>
 * 文件名：SysMenuBorder.java <p>
 * 创建时间：2013-7-21 下午1:51:07 <p>
 * 所属项目：GmudTest <p>
 * @author 12548 <p>
 */
package lostland.gumd.platinum12548.ui;

import lostland.gumd.platinum12548.GmudGame;
import lostland.gumd.platinum12548.ui.core.GmudWindow;

/**
 * 类名：SysMenuBorder <p>
 * 说明：系统菜单边界
 * @author 12548
 */
public class PracticeMenuBorder extends GmudWindow {

	
	public static final int TOP = 5;
	public static final int LEFT = 100;
	public static final int HEIGHT = PracticeMenuButton.HEIGHT *3 + PracticeMenuButton.MARGIN_TOP * 5+2;
	public static final int WIDTH = PracticeMenuButton.WIDTH + PracticeMenuButton.MARGIN_LEFT +4;
	
	public PracticeMenuBorder(GmudGame game)
	{
		super(game,LEFT,TOP,WIDTH,HEIGHT);
	}
	
	/* （非 Javadoc）
	 * @see lostland.gumd.platinum12548.GmudWindow#draw()
	 */
	@Override
	public void draw() {
		this.drawBackground();
	}

}
