/**
 * ��׿�׽�Ӣ��̳������ <p>
 * �ļ�����Item.java <p>
 * ����ʱ�䣺2013-7-27 ����10:38:20 <p>
 * ������Ŀ��GmudTest <p>
 * @author 12548 <p>
 */
package lostland.gumd.platinum12548.data;

import lostland.gumd.platinum12548.GmudWorld;

/**
 * ������Item <p>
 * ˵����
 * @author 12548
 */
public class Item {

	// [82]
	static final String item_names[] = new String[]{
		"none", "������", "����", "���Ͳ�", "��䶹��", "����", "�Ǻ�«", "���񶹸�", "��ҩ", "������", 
		"�����ɵ�", "�ֵ�", "�˵�", "ذ��", "̴����", "���ֹ�", "ɱ����", "����", "������", "����", 
		"԰����", "����", "����", "��ͷ��", "�Ͻ�", "�滨��", "����", "����", "���", "������", 
		"������", "���඾", "������", "��潣", "����", "����", "������", "���̽�", "ϸ��", "����", 
		"�ϻ���", "��ĵ��", "����", "���Ʋ���", "Ƥ����", "�ۺ����", "��ž�", "�廨СЬ", "��õ��", "�軨", 
		"�Ứ����", "������Ь", "��������", "ҹ����", "��ˮ����", "��ɴ��ȹ", "������", "����", "�����", "����", 
		"������", "����", "�����Ӽ�", "��ħ��", "�޺�����", "ѩɽ����", "������", "��Ƥ", "ȭ��", "����ֽҳ", 
		"���쵶��", "�ֳ���", "ë��", "����", "����", "ţƤ����", "��¨", "����ʯ��", "Ů����", "������", 
		"�廨��", "�˻�����"
		};
	
	// ��Ʒ����!!
	// 0ʳ�0��+food��+water��0��0��cost
	// 1ҩ�type��+Ч��1��0��0��0��cost
	// 2������type��+������+���У�+�رܣ�0��cost (weapon type 1�� 6�� 7�� 9��)
	// 3װ����type��+������+���У�+�رܣ�0��cost  (equip type 0��Ʒ 2�� 3���� 4���� 5���� 9���� 10Ь)
	// 4�鼮�� 0��type��require HP��max_level��require EXP��cost
	// 5������ 0, 0��0��0��0��cost
	static final int item_attribs[][] = new int[][] {
		// none
		{0, 0, 0, 0, 0, 0, 0},
		// ������
		{0, 0, 160, 0, 0, 0, 30},
		// ����
		{0, 0, 120, 0, 0, 0, 20},
		// ���Ͳ�
		{0, 0, 180, 200, 0, 0, 150},
		// ��䶹��
		{0, 0, 160, 0, 0, 0, 55},
		// ����
		{0, 0, 240, 0, 0, 0, 100},
		// �Ǻ�«
		{0, 0, 60, 0, 0, 0, 50},
		// ���񶹸�
		{0, 0, 80, 0, 0, 0, 35},
		// ��ҩ
		{1, 0, 0, 0, 0, 0, 2000},
		// ������
		{1, 0, 1, 0, 0, 0, 3000},
		// �����ɵ�
		{1, 1, 5, 0, 0, 0, 3000},
		// �ֵ�
		{2, 1, 25, 0, -1, 0, 600},
		// �˵�
		{2, 1, 17, 0, 0, 0, 100},
		// ذ��
		{2, 6, 5, 0, 0, 0, 50},
		// ̴����
		{2, 6, 15, 0, 0, 0, 1500},
		// ���ֹ�
		{2, 1, 55, 5, -3, 0, 30000},
		// ɱ����
		{2, 1, 25, 0, 0, 0, 1000},
		// ����
		{2, 6, 25, 0, -1, 0, 600},
		// ������
		{2, 6, 10, 0, 0, 0, 70},
		// ����
		{2, 9, 1, 0, 0, 0, 0},
		// ԰����
		{2, 6, 15, 0, 0, 0, 1000},
		// ����
		{2, 7, 28, 0, -2, 0, 700},
		// ����
		{2, 9, 20, 0, 0, 0, 500},
		// ��ͷ��
		{2, 1, 35, 3, 0, 0, 800},
		// �Ͻ�
		{2, 1, 55, 0, -2, 0, 20000},
		// �滨��
		{2, 9, 70, 0, -2, 0, 34464},
		// ����
		{2, 9, 35, 0, 0, 0, 20000},
		// ����
		{2, 1, 40, 0, -1, 0, 20000},
		// ���
		{2, 9, 55, 0, -1, 0, 40000},
		// ������
		{2, 6, 15, 0, 0, 0, 5500},
		// ������
		{2, 1, 35, 0, 0, 0, 9464},
		// ���඾
		{2, 1, 55, 0, -2, 0, 50000},
		// ������
		{2, 7, 35, 0, 0, 0, 5000},
		// ��潣
		{2, 6, 65, 0, 0, 0, 7000},
		// ����
		{2, 7, 20, 0, 0, 0, 1000},
		// ����
		{2, 6, 30, 0, 0, 0, 1000},
		// ������
		{2, 6, 45, 0, 0, 0, 10000},
		// ���̽�
		{2, 6, 60, 0, 0, 0, 30000},
		// ϸ��
		{2, 6, 30, 0, 0, 0, 700},
		// ����
		{3, 2, 45, 0, 3, 0, 50000},
		// �ϻ���
		{3, 0, 0, 0, 0, 0, 100},
		// ��ĵ��
		{3, 0, 0, 0, 0, 0, 20},
		// ����
		{3, 2, 5, 0, 0, 0, 8},
		// ���Ʋ���
		{3, 2, 15, 0, 0, 0, 500},
		// Ƥ����
		{3, 3, 15, 0, -1, 0, 1000},
		// �ۺ����
		{3, 2, 10, 0, 0, 0, 600},
		// ��ž�
		{3, 0, 0, 0, 0, 0, 20},
		// �廨СЬ
		{3, 10, 5, 0, 0, 0, 300},
		// ��õ��
		{3, 0, 0, 0, 0, 0, 20},
		// �軨
		{3, 0, 0, 0, 0, 0, 40},
		// �Ứ����
		{3, 2, 8, 0, 0, 0, 100},
		// ������Ь
		{3, 10, 10, 0, 3, 0, 300},
		// ��������
		{3, 2, 0, 0, 10, 0, 300},
		// ҹ����
		{3, 2, 0, 0, 6, 0, 14464},
		// ��ˮ����
		{3, 2, 10, 0, 5, 0, 1500},
		// ��ɴ��ȹ
		{3, 2, 1, 0, 0, 0, 10},
		// ������
		{3, 0, 3, 3, 0, 0, 100},
		// ����
		{3, 4, 5, 0, 2, 0, 2000},
		// �����
		{3, 2, 5, 5, 0, 0, 500},
		// ����
		{3, 2, 5, 0, 0, 0, 300},
		// ������
		{3, 2, 15, 0, 0, 0, 400},
		// ����
		{3, 2, 4, 0, 0, 0, 600},
		// �����Ӽ�
		{3, 3, 60, 0, -5, 0, 10000},
		// ��ħ��
		{3, 3, 10, 0, 5, 0, 2000},
		// �޺�����
		{3, 2, 10, 0, 8, 0, 3000},
		// ѩɽ����
		{3, 2, 4, 0, 0, 0, 600},
		// ������
		{3, 3, 45, 0, -3, 0, 5000},
		// ��Ƥ
		{3, 3, 40, 0, 0, 0, 5000},
		// ȭ��
		{4, 0, 191, 60, 0, 0, 500},
		// ����ֽҳ
		{4, 0, 196, 60, 0, 0, 150},
		// ���쵶��
		{4, 0, 201, 60, 0, 0, 150},
		// �ֳ���
		{4, 0, 206, 60, 0, 0, 100},
		// ë��
		{5, 0, 0, 0, 0, 0, 50},
		// ����
		{3, 9, 0, 0, 0, 0, 300},
		// ����
		{0, 0, 250, 0, 0, 0, 250},
		// ţƤ����
		{3, 5, 2, 0, 2, 0, 5000},
		// ��¨
		{5, 0, 0, 0, 0, 0, 100},
		// ����ʯ��
		{5, 0, 0, 0, 0, 0, 0},
		// Ů����
		{5, 0, 0, 0, 0, 0, 380},
		// ������
		{2, 1, 88, 5, -10, 0, 30000},
		// �廨��
		{2, 6, 99, 10, 5, 0, 50000},
		// �˻�����
		{4, 0, 211, 60, 0, 0, 0}
	};

	
	
	
	
	public static int ROPE_INDEX = 19;
	
	public int id;
	public int kind;
	public int subkind;
	public String name;
	
	public int a3,a4,a5,a6;
	
	public int cost;
	
	public String des = "��������";
	
	/**
	 * 
	 */
	public Item() {
		// TODO �Զ����ɵĹ��캯�����
	}

	
	public static void init()
	{
		int i;
		for(i=0;i<82;i++)
		{
			GmudWorld.wp[i] = new Item();
			GmudWorld.wp[i].id = i;
			GmudWorld.wp[i].name = item_names[i];
			GmudWorld.wp[i].kind = item_attribs[i][0];
			GmudWorld.wp[i].subkind = item_attribs[i][1];
			GmudWorld.wp[i].a3 = item_attribs[i][2];
			GmudWorld.wp[i].a4 = item_attribs[i][3];
			GmudWorld.wp[i].a5 = item_attribs[i][4];
			GmudWorld.wp[i].a6 = item_attribs[i][5];
			GmudWorld.wp[i].cost = item_attribs[i][6];
		}
	}


}