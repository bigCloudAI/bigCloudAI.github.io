package bigCloudAI.github.io.cloud.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TC_SERVICE",catalog="")
public class DService  implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int tcServiceId;  //TC_SERVICE_ID  int(8) not null comment 'TC服务ID'
	
	 @Column(name = "SERVICE_ID",columnDefinition="varchar(64)"/*,columnDefinition="swarm服务id"*/,length=32,nullable=true,unique=true)
		private String serviceId; 
	 
	 @Column(name = "SERVICE_NAME",columnDefinition="varchar(64)",/*columnDefinition="服务名称",*/length=64,nullable=false,unique=true)
		private String serviceName; 
	 
	 @Column(name = "SERVICE_REPLICAS",columnDefinition="int(8)",/*columnDefinition="服务副本数",*/length=8,nullable=true,unique=false)
		private int serviceReplicas; 
	 
	  @Column(name = "SERVICE_IMAGE_ID",columnDefinition="int(8)",/*columnDefinition="服务镜像ID",*/length=8,nullable=true,unique=false)
		private int serviceImageId; 
	  
	  @Column(name = "SERVICE_IMAGE_NAME",columnDefinition="varchar(128)",/*columnDefinition="'镜像名'（+tag）",*/length=8,nullable=true,unique=false)
		private String serviceImageName; 
	  
	  @Column(name = "SERVICE_MODE",columnDefinition="int(8)",/*columnDefinition="'服务模式（0vip 1dnssr）",*/length=8,nullable=true,unique=false)
		private int serviceMode;
	 
	  @Column(name = "SERVICE_NETWORK_ID",columnDefinition="varchar(32)",/*columnDefinition="'服务网络ID",*/length=8,nullable=true,unique=false)
		private String serviceNetworkId;
	  
	  @Column(name = "TC_NETWORK_NAME",columnDefinition="varchar(32)",/*columnDefinition="'网络名称",*/length=8,nullable=true,unique=false)
		private String tcNetworkName;
	  
	  @Column(name = "SERVICES_COMMAND",columnDefinition="varchar(32)",/*columnDefinition="'服务运行参数",*/length=8,nullable=true,unique=false)
		private String servicesCommand;
	  
	  @Column(name = "SERVICE_PUBLISH_PORT",columnDefinition="int(8)",/*columnDefinition="服务对外端口",*/length=8,nullable=true,unique=false)
		private int servicePublishPort;
	  
	  @Column(name = "SERVICE_TARGET_PORT",columnDefinition="int(8)",/*,columnDefinition="'内部端口",*/length=8,nullable=true,unique=false)
		private int serviceTagetPort;
	  
	  @Column(name = "SERVICE_ADDR",columnDefinition="varchar(32)",/*columnDefinition="服务虚拟IP,只有在模式为vip的时候才有效）",*/length=8,nullable=true,unique=false)
		private String serviceAddr;
	  
	  @Column(name = "TC_CLUSTER_ID",columnDefinition="int(8)",/*columnDefinition="这个服务所属的集群",*/length=8,nullable=true,unique=false)
		private int tcClusterId;
	  
	  @Column(name = "TC_APPLICATION_ID",columnDefinition="int(8)"/*,columnDefinition="服务属于指定应用"*/,length=8,nullable=true,unique=false)
			private int tcApplicationId;
	  
	  @Column(name = "TC_SERVICE_STATUS",columnDefinition="int(8)",/*columnDefinition="0运行 1未启动 -1 删除",*/length=8,nullable=false,unique=false)
			private int tcServiceStatus;
	  
	  @Column(name = "CREATE_TIME",columnDefinition="datetime",/*columnDefinition="创建时间",*/length=8,nullable=false,unique=false)
			private Date createTime;
	  
	  @Column(name = "UPDATE_TIME",columnDefinition="datetime",/*columnDefinition="更新时间",*/length=8,nullable=true,unique=false)
			private Date updateTime;
	  
	  @Column(name = "TC_NETWORK_ID",columnDefinition="int(8)",/*columnDefinition="tc网络id",*/length=8,nullable=true,unique=false)
			private int tcNetworkId;
	  
	  @Column(name = "PATH",columnDefinition="text",/*columnDefinition='环境变量",*/length=8,nullable=true,unique=false)
			private String path;
	  
	  @Column(name = "VOLUME",columnDefinition="text",/*columnDefinition="映射位置",*/length=8,nullable=true,unique=false)
			private String volume;
	  
	  @Column(name = "VERSION",columnDefinition="int(8)",/*columnDefinition="版本号",*/length=8,nullable=true,unique=false)
			private int version;
	  
	  
	  @Column(name = "SERVICE_SCHEDU_MODE",columnDefinition="int(8)",/*columnDefinition="服务的计划模式（0 replicated  1 global）",*/length=8,nullable=true,unique=false)
			private int serviceScheduMode;
	  
	  @Column(name = "SERVICE_TYPE",columnDefinition="int(8)",/*columnDefinition="服务类型（0：应用服务；1公共定制服务;2申请服务）",*/length=8,nullable=true,unique=false)
			private int serviceType;

	public int getTcServiceId() {
		return tcServiceId;
	}

	public void setTcServiceId(int tcServiceId) {
		this.tcServiceId = tcServiceId;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public int getServiceReplicas() {
		return serviceReplicas;
	}

	public void setServiceReplicas(int serviceReplicas) {
		this.serviceReplicas = serviceReplicas;
	}

	public int getServiceImageId() {
		return serviceImageId;
	}

	public void setServiceImageId(int serviceImageId) {
		this.serviceImageId = serviceImageId;
	}

	public String getServiceImageName() {
		return serviceImageName;
	}

	public void setServiceImageName(String serviceImageName) {
		this.serviceImageName = serviceImageName;
	}

	public int getServiceMode() {
		return serviceMode;
	}

	public void setServiceMode(int serviceMode) {
		this.serviceMode = serviceMode;
	}

	public String getServiceNetworkId() {
		return serviceNetworkId;
	}

	public void setServiceNetworkId(String serviceNetworkId) {
		this.serviceNetworkId = serviceNetworkId;
	}

	public String getTcNetworkName() {
		return tcNetworkName;
	}

	public void setTcNetworkName(String tcNetworkName) {
		this.tcNetworkName = tcNetworkName;
	}

	public String getServicesCommand() {
		return servicesCommand;
	}

	public void setServicesCommand(String servicesCommand) {
		this.servicesCommand = servicesCommand;
	}

	public int getServicePublishPort() {
		return servicePublishPort;
	}

	public void setServicePublishPort(int servicePublishPort) {
		this.servicePublishPort = servicePublishPort;
	}

	public int getServiceTagetPort() {
		return serviceTagetPort;
	}

	public void setServiceTagetPort(int serviceTagetPort) {
		this.serviceTagetPort = serviceTagetPort;
	}

	public String getServiceAddr() {
		return serviceAddr;
	}

	public void setServiceAddr(String serviceAddr) {
		this.serviceAddr = serviceAddr;
	}

	public int getTcClusterId() {
		return tcClusterId;
	}

	public void setTcClusterId(int tcClusterId) {
		this.tcClusterId = tcClusterId;
	}

	public int getTcApplicationId() {
		return tcApplicationId;
	}

	public void setTcApplicationId(int tcApplicationId) {
		this.tcApplicationId = tcApplicationId;
	}

	public int getTcServiceStatus() {
		return tcServiceStatus;
	}

	public void setTcServiceStatus(int tcServiceStatus) {
		this.tcServiceStatus = tcServiceStatus;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public int getTcNetworkId() {
		return tcNetworkId;
	}

	public void setTcNetworkId(int tcNetworkId) {
		this.tcNetworkId = tcNetworkId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public int getServiceScheduMode() {
		return serviceScheduMode;
	}

	public void setServiceScheduMode(int serviceScheduMode) {
		this.serviceScheduMode = serviceScheduMode;
	}

	public int getServiceType() {
		return serviceType;
	}

	public void setServiceType(int serviceType) {
		this.serviceType = serviceType;
	}
	  
	
}	
