package com.ssm.utils;

public class Page {
	private Integer start = 0;
	private Integer count = 5;
	private Integer last = 0;

	private Integer next = 0;
	private Integer pre = 0;

	private Integer nowPage;
	private Integer totalPage;

	public int getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public int getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public int getLast() {
		return last;
	}

	public void setLast(Integer last) {
		this.last = last;
	}

	public Integer getNext() {
		return next;
	}

	public void setNext(Integer next) {
		this.next = next;
	}

	public Integer getPre() {
		return pre;
	}

	public void setPre(Integer pre) {
		this.pre = pre;
	}

	public Integer getNowPage() {
		return nowPage;
	}

	public void setNowPage(Integer nowPage) {
		this.nowPage = nowPage;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public void caculateLast(Integer total) {
		// ����������50�����ܹ���5�����ģ���ô���һҳ�Ŀ�ʼ����45
		if (0 == total % count) {
			last = total - count;
		}
		// ����������51�����ܹ���5�����ģ���ô���һҳ�Ŀ�ʼ����50
		else {
			last = total - total % count;
		}
		if ((start + count) > total) {
			next = last;
		} else {
			next = start + count;
		}
		if ((start - count) < 0) {
			pre = 0;
		} else {
			pre = start - count;
		}

		// ��ҳ��
		if (0 != total % count) {
			totalPage = Math.abs(total / count) + 1;
		} else {
			totalPage = Math.abs(total / count);
		}

		// ��ǰҳ��
		if (0 != start % count) {
			nowPage = Math.abs(start / count) + 2;
		} else {
			nowPage = Math.abs(start / count) + 1;
		}
	}
}