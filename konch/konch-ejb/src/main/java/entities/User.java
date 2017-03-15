package entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private Integer id;
	private String name;

	@ManyToOne
	private Team team;

	@OneToMany(mappedBy = "supervisor")
	private List<Project> projectsSupervised;

	@OneToMany(mappedBy = "assignee")
	private List<Task> tasks;

	public User() {
		super();
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public List<Project> getProjectsSupervised() {
		return projectsSupervised;
	}

	public void setProjectsSupervised(List<Project> projectsSupervised) {
		this.projectsSupervised = projectsSupervised;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

}