package com.dianping.cat.report.page.home;

public enum Action implements com.site.web.mvc.Action {
	VIEW("view"),

	CHECKPOINT("checkpoint"),
	
	THREAD_DUMP("threadDump");

	private String m_name;

	private Action(String name) {
		m_name = name;
	}

	public static Action getByName(String name, Action defaultAction) {
		for (Action action : Action.values()) {
			if (action.getName().equals(name)) {
				return action;
			}
		}

		return defaultAction;
	}

	@Override
	public String getName() {
		return m_name;
	}
}
