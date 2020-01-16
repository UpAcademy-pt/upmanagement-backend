package pt.upacademy.coreFinalProject.models;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Account extends Entity_ {
		private List<Long> userAcademies;
		private String permissions;
		private Long userId;
		private String email;
		private String name;
		private AnsweredQuestions data;
		
		private static final long serialVersionUID = 1L;
		
		public List<Long> getUserAcademies() {
			return userAcademies;
		}

		public void setUserAcademies(List<Long> userAcademies) {
			this.userAcademies = userAcademies;
		}

		public String getPermissions() {
			return permissions;
		}

		public void setPermissions(String permissions) {
			this.permissions = permissions;
		}

		public Long getUserId() {
			return userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

        public AnsweredQuestions getData() {
			return data;
		}

		public void setData(AnsweredQuestions data) {
			this.data = data;
		}

	}
