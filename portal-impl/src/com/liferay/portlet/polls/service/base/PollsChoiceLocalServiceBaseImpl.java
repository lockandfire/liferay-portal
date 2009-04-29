/**
 * Copyright (c) 2000-2009 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portlet.polls.service.base;

import com.liferay.counter.service.CounterLocalService;
import com.liferay.counter.service.CounterService;

import com.liferay.portal.PortalException;
import com.liferay.portal.SystemException;
import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.polls.model.PollsChoice;
import com.liferay.portlet.polls.service.PollsChoiceLocalService;
import com.liferay.portlet.polls.service.PollsQuestionLocalService;
import com.liferay.portlet.polls.service.PollsQuestionService;
import com.liferay.portlet.polls.service.PollsVoteLocalService;
import com.liferay.portlet.polls.service.PollsVoteService;
import com.liferay.portlet.polls.service.persistence.PollsChoiceFinder;
import com.liferay.portlet.polls.service.persistence.PollsChoicePersistence;
import com.liferay.portlet.polls.service.persistence.PollsQuestionPersistence;
import com.liferay.portlet.polls.service.persistence.PollsVotePersistence;

import java.util.List;

/**
 * <a href="PollsChoiceLocalServiceBaseImpl.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public abstract class PollsChoiceLocalServiceBaseImpl
	implements PollsChoiceLocalService {
	public PollsChoice addPollsChoice(PollsChoice pollsChoice)
		throws SystemException {
		pollsChoice.setNew(true);

		return pollsChoicePersistence.update(pollsChoice, false);
	}

	public PollsChoice createPollsChoice(long choiceId) {
		return pollsChoicePersistence.create(choiceId);
	}

	public void deletePollsChoice(long choiceId)
		throws PortalException, SystemException {
		pollsChoicePersistence.remove(choiceId);
	}

	public void deletePollsChoice(PollsChoice pollsChoice)
		throws SystemException {
		pollsChoicePersistence.remove(pollsChoice);
	}

	public List<Object> dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return pollsChoicePersistence.findWithDynamicQuery(dynamicQuery);
	}

	public List<Object> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) throws SystemException {
		return pollsChoicePersistence.findWithDynamicQuery(dynamicQuery, start,
			end);
	}

	public PollsChoice getPollsChoice(long choiceId)
		throws PortalException, SystemException {
		return pollsChoicePersistence.findByPrimaryKey(choiceId);
	}

	public List<PollsChoice> getPollsChoices(int start, int end)
		throws SystemException {
		return pollsChoicePersistence.findAll(start, end);
	}

	public int getPollsChoicesCount() throws SystemException {
		return pollsChoicePersistence.countAll();
	}

	public PollsChoice updatePollsChoice(PollsChoice pollsChoice)
		throws SystemException {
		pollsChoice.setNew(false);

		return pollsChoicePersistence.update(pollsChoice, true);
	}

	public PollsChoice updatePollsChoice(PollsChoice pollsChoice, boolean merge)
		throws SystemException {
		pollsChoice.setNew(false);

		return pollsChoicePersistence.update(pollsChoice, merge);
	}

	public PollsChoiceLocalService getPollsChoiceLocalService() {
		return pollsChoiceLocalService;
	}

	public void setPollsChoiceLocalService(
		PollsChoiceLocalService pollsChoiceLocalService) {
		this.pollsChoiceLocalService = pollsChoiceLocalService;
	}

	public PollsChoicePersistence getPollsChoicePersistence() {
		return pollsChoicePersistence;
	}

	public void setPollsChoicePersistence(
		PollsChoicePersistence pollsChoicePersistence) {
		this.pollsChoicePersistence = pollsChoicePersistence;
	}

	public PollsChoiceFinder getPollsChoiceFinder() {
		return pollsChoiceFinder;
	}

	public void setPollsChoiceFinder(PollsChoiceFinder pollsChoiceFinder) {
		this.pollsChoiceFinder = pollsChoiceFinder;
	}

	public PollsQuestionLocalService getPollsQuestionLocalService() {
		return pollsQuestionLocalService;
	}

	public void setPollsQuestionLocalService(
		PollsQuestionLocalService pollsQuestionLocalService) {
		this.pollsQuestionLocalService = pollsQuestionLocalService;
	}

	public PollsQuestionService getPollsQuestionService() {
		return pollsQuestionService;
	}

	public void setPollsQuestionService(
		PollsQuestionService pollsQuestionService) {
		this.pollsQuestionService = pollsQuestionService;
	}

	public PollsQuestionPersistence getPollsQuestionPersistence() {
		return pollsQuestionPersistence;
	}

	public void setPollsQuestionPersistence(
		PollsQuestionPersistence pollsQuestionPersistence) {
		this.pollsQuestionPersistence = pollsQuestionPersistence;
	}

	public PollsVoteLocalService getPollsVoteLocalService() {
		return pollsVoteLocalService;
	}

	public void setPollsVoteLocalService(
		PollsVoteLocalService pollsVoteLocalService) {
		this.pollsVoteLocalService = pollsVoteLocalService;
	}

	public PollsVoteService getPollsVoteService() {
		return pollsVoteService;
	}

	public void setPollsVoteService(PollsVoteService pollsVoteService) {
		this.pollsVoteService = pollsVoteService;
	}

	public PollsVotePersistence getPollsVotePersistence() {
		return pollsVotePersistence;
	}

	public void setPollsVotePersistence(
		PollsVotePersistence pollsVotePersistence) {
		this.pollsVotePersistence = pollsVotePersistence;
	}

	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	public CounterService getCounterService() {
		return counterService;
	}

	public void setCounterService(CounterService counterService) {
		this.counterService = counterService;
	}

	protected void runSQL(String sql) throws SystemException {
		try {
			PortalUtil.runSQL(sql);
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(name = "com.liferay.portlet.polls.service.PollsChoiceLocalService.impl")
	protected PollsChoiceLocalService pollsChoiceLocalService;
	@BeanReference(name = "com.liferay.portlet.polls.service.persistence.PollsChoicePersistence.impl")
	protected PollsChoicePersistence pollsChoicePersistence;
	@BeanReference(name = "com.liferay.portlet.polls.service.persistence.PollsChoiceFinder.impl")
	protected PollsChoiceFinder pollsChoiceFinder;
	@BeanReference(name = "com.liferay.portlet.polls.service.PollsQuestionLocalService.impl")
	protected PollsQuestionLocalService pollsQuestionLocalService;
	@BeanReference(name = "com.liferay.portlet.polls.service.PollsQuestionService.impl")
	protected PollsQuestionService pollsQuestionService;
	@BeanReference(name = "com.liferay.portlet.polls.service.persistence.PollsQuestionPersistence.impl")
	protected PollsQuestionPersistence pollsQuestionPersistence;
	@BeanReference(name = "com.liferay.portlet.polls.service.PollsVoteLocalService.impl")
	protected PollsVoteLocalService pollsVoteLocalService;
	@BeanReference(name = "com.liferay.portlet.polls.service.PollsVoteService.impl")
	protected PollsVoteService pollsVoteService;
	@BeanReference(name = "com.liferay.portlet.polls.service.persistence.PollsVotePersistence.impl")
	protected PollsVotePersistence pollsVotePersistence;
	@BeanReference(name = "com.liferay.counter.service.CounterLocalService.impl")
	protected CounterLocalService counterLocalService;
	@BeanReference(name = "com.liferay.counter.service.CounterService.impl")
	protected CounterService counterService;
}