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

package com.liferay.portlet.blogs.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * <a href="BlogsStatsUserPersistence.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public interface BlogsStatsUserPersistence extends BasePersistence {
	public void cacheResult(
		com.liferay.portlet.blogs.model.BlogsStatsUser blogsStatsUser);

	public void cacheResult(
		java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> blogsStatsUsers);

	public void clearCache();

	public com.liferay.portlet.blogs.model.BlogsStatsUser create(
		long statsUserId);

	public com.liferay.portlet.blogs.model.BlogsStatsUser remove(
		long statsUserId)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException;

	public com.liferay.portlet.blogs.model.BlogsStatsUser remove(
		com.liferay.portlet.blogs.model.BlogsStatsUser blogsStatsUser)
		throws com.liferay.portal.SystemException;

	/**
	 * @deprecated Use <code>update(BlogsStatsUser blogsStatsUser, boolean merge)</code>.
	 */
	public com.liferay.portlet.blogs.model.BlogsStatsUser update(
		com.liferay.portlet.blogs.model.BlogsStatsUser blogsStatsUser)
		throws com.liferay.portal.SystemException;

	/**
	 * Add, update, or merge, the entity. This method also calls the model
	 * listeners to trigger the proper events associated with adding, deleting,
	 * or updating an entity.
	 *
	 * @param        blogsStatsUser the entity to add, update, or merge
	 * @param        merge boolean value for whether to merge the entity. The
	 *                default value is false. Setting merge to true is more
	 *                expensive and should only be true when blogsStatsUser is
	 *                transient. See LEP-5473 for a detailed discussion of this
	 *                method.
	 * @return        true if the portlet can be displayed via Ajax
	 */
	public com.liferay.portlet.blogs.model.BlogsStatsUser update(
		com.liferay.portlet.blogs.model.BlogsStatsUser blogsStatsUser,
		boolean merge) throws com.liferay.portal.SystemException;

	public com.liferay.portlet.blogs.model.BlogsStatsUser updateImpl(
		com.liferay.portlet.blogs.model.BlogsStatsUser blogsStatsUser,
		boolean merge) throws com.liferay.portal.SystemException;

	public com.liferay.portlet.blogs.model.BlogsStatsUser findByPrimaryKey(
		long statsUserId)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException;

	public com.liferay.portlet.blogs.model.BlogsStatsUser fetchByPrimaryKey(
		long statsUserId) throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByGroupId(
		long groupId) throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException;

	public com.liferay.portlet.blogs.model.BlogsStatsUser findByGroupId_First(
		long groupId, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException;

	public com.liferay.portlet.blogs.model.BlogsStatsUser findByGroupId_Last(
		long groupId, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException;

	public com.liferay.portlet.blogs.model.BlogsStatsUser[] findByGroupId_PrevAndNext(
		long statsUserId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException;

	public java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByUserId(
		long userId) throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException;

	public com.liferay.portlet.blogs.model.BlogsStatsUser findByUserId_First(
		long userId, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException;

	public com.liferay.portlet.blogs.model.BlogsStatsUser findByUserId_Last(
		long userId, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException;

	public com.liferay.portlet.blogs.model.BlogsStatsUser[] findByUserId_PrevAndNext(
		long statsUserId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException;

	public com.liferay.portlet.blogs.model.BlogsStatsUser findByG_U(
		long groupId, long userId)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException;

	public com.liferay.portlet.blogs.model.BlogsStatsUser fetchByG_U(
		long groupId, long userId) throws com.liferay.portal.SystemException;

	public com.liferay.portlet.blogs.model.BlogsStatsUser fetchByG_U(
		long groupId, long userId, boolean retrieveFromCache)
		throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByG_E(
		long groupId, int entryCount) throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByG_E(
		long groupId, int entryCount, int start, int end)
		throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByG_E(
		long groupId, int entryCount, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException;

	public com.liferay.portlet.blogs.model.BlogsStatsUser findByG_E_First(
		long groupId, int entryCount,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException;

	public com.liferay.portlet.blogs.model.BlogsStatsUser findByG_E_Last(
		long groupId, int entryCount,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException;

	public com.liferay.portlet.blogs.model.BlogsStatsUser[] findByG_E_PrevAndNext(
		long statsUserId, long groupId, int entryCount,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException;

	public java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByC_E(
		long companyId, int entryCount)
		throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByC_E(
		long companyId, int entryCount, int start, int end)
		throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findByC_E(
		long companyId, int entryCount, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException;

	public com.liferay.portlet.blogs.model.BlogsStatsUser findByC_E_First(
		long companyId, int entryCount,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException;

	public com.liferay.portlet.blogs.model.BlogsStatsUser findByC_E_Last(
		long companyId, int entryCount,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException;

	public com.liferay.portlet.blogs.model.BlogsStatsUser[] findByC_E_PrevAndNext(
		long statsUserId, long companyId, int entryCount,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException;

	public java.util.List<Object> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.SystemException;

	public java.util.List<Object> findWithDynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findAll()
		throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findAll(
		int start, int end) throws com.liferay.portal.SystemException;

	public java.util.List<com.liferay.portlet.blogs.model.BlogsStatsUser> findAll(
		int start, int end, com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException;

	public void removeByGroupId(long groupId)
		throws com.liferay.portal.SystemException;

	public void removeByUserId(long userId)
		throws com.liferay.portal.SystemException;

	public void removeByG_U(long groupId, long userId)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.blogs.NoSuchStatsUserException;

	public void removeByG_E(long groupId, int entryCount)
		throws com.liferay.portal.SystemException;

	public void removeByC_E(long companyId, int entryCount)
		throws com.liferay.portal.SystemException;

	public void removeAll() throws com.liferay.portal.SystemException;

	public int countByGroupId(long groupId)
		throws com.liferay.portal.SystemException;

	public int countByUserId(long userId)
		throws com.liferay.portal.SystemException;

	public int countByG_U(long groupId, long userId)
		throws com.liferay.portal.SystemException;

	public int countByG_E(long groupId, int entryCount)
		throws com.liferay.portal.SystemException;

	public int countByC_E(long companyId, int entryCount)
		throws com.liferay.portal.SystemException;

	public int countAll() throws com.liferay.portal.SystemException;
}