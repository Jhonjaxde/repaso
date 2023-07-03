package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;


import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name = "citaMedica")
public class CitaMedica {
	@GeneratedValue(generator = "seq_citaMedica", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_citaMedica", sequenceName = "seq_citaMedica", allocationSize = 1)
	@Id
	@Column(name = "cime_id")
	private Integer id;
	@Column(name = "cime_numeroTurno")
	private String numeroTurno;
	@Column(name = "cime_fechaCita")
	private LocalDateTime fechaCita;
	@Column(name = "cime_costoCita")
	private BigDecimal costoCita;
	@Column(name = "cime_lugarCita")
	private String lugarCita;
	@Column(name = "cime_diagnostico")
	private String diagnostico;
	@Column(name = "cime_receta")
	private String receta;
	@Column(name = "cime_fechaControl")
	private LocalDateTime fechaControl;
	
	@ManyToOne
	@JoinColumn(name = "cime_id_doctor")
	private Doctor doctor; 
	
	
	@ManyToOne
	@JoinColumn(name = "cime_id_paciente")
	private Paciente paciente;
	//SET AND GET


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNumeroTurno() {
		return numeroTurno;
	}


	public void setNumeroTurno(String numeroTurno) {
		this.numeroTurno = numeroTurno;
	}


	public LocalDateTime getFechaCita() {
		return fechaCita;
	}


	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}


	public BigDecimal getCostoCita() {
		return costoCita;
	}


	public void setCostoCita(BigDecimal costoCita) {
		this.costoCita = costoCita;
	}


	public String getLugarCita() {
		return lugarCita;
	}


	public void setLugarCita(String lugarCita) {
		this.lugarCita = lugarCita;
	}


	public String getDiagnostico() {
		return diagnostico;
	}


	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}


	public String getReceta() {
		return receta;
	}


	public void setReceta(String receta) {
		this.receta = receta;
	}


	public LocalDateTime getFechaControl() {
		return fechaControl;
	}


	public void setFechaControl(LocalDateTime fechaControl) {
		this.fechaControl = fechaControl;
	}


	public Doctor getDoctor() {
		return doctor;
	}


	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}


	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


	@Override
	public String toString() {
		return "CitaMedica [id=" + id + ", numeroTurno=" + numeroTurno + ", fechaCita=" + fechaCita + ", costoCita="
				+ costoCita + ", lugarCita=" + lugarCita + ", diagnostico=" + diagnostico + ", receta=" + receta
				+ ", fechaControl=" + fechaControl + ", doctor=" + doctor + ", paciente=" + paciente + "]";
	}
	
	


}
