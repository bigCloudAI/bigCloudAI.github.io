package bigCloudAI.github.io.cloud.entity;

import org.json.JSONObject;

public class DHost {

	
	private String NGoroutines;
	
	public String getNGoroutines() {
		return NGoroutines;
	}

	public void setNGoroutines(String nGoroutines) {
		NGoroutines = nGoroutines;
	}

	private int dhostId;
	private String ip;
	private String ID;// "ID":
					// "62ST:FGFF:P7RF:EIJO:X3X2:S2NX:ZH6C:GVHW:Y6X2:VHUG:56TM:VGBI",
	private int containers;// ": 0,
	private int containersRunning;// ": 0,
	private int containersPaused;// : 0,
	private int containersStopped;// ": 0,
	private int images;// ": 0,
	private String driver;// ": "devicemapper",
	private JSONObject driverStatus;// ": [],
	private JSONObject systemStatus;// ": null,
	private JSONObject plugins;// ": {},
	private boolean memoryLimit;// ": true,
	private boolean swapLimit;// ": true,
	private boolean kernelMemory;// ": true,
	private boolean cpuCfsPeriod;// ": true,
	private boolean cpuCfsQuota;// ": true,
	private boolean cPUShares;// ": true,
	private boolean cPUSet;// ": true,
	private boolean iPv4Forwarding;// ": true,
	private boolean bridgeNfIptables;// ": false,
	private boolean bridgeNfIp6tables;// ": false,
	private boolean debug;// ": false,
	private int nFd;// : 19,
	private boolean oomKillDisable;// ": true,
	/*
	 * "NGoroutines": 26, "SystemTime": "2017-05-01T08:45:07.171915344-07:00",
	 * "LoggingDriver": "json-file", "CgroupDriver": "cgroupfs",
	 * "NEventsListener": 0, "KernelVersion": "3.10.0-123.el7.x86_64",
	 * "OperatingSystem": "Red Hat Enterprise Linux Server 7.0 (Maipo)",
	 * "OSType": "linux", "Architecture": "x86_64", "IndexServerAddress":
	 * "https://index.docker.io/v1/", "RegistryConfig": {}, "NCPU": 4,
	 * "MemTotal": 499073024, "DockerRootDir": "/var/lib/docker", "HttpProxy":
	 * "", "HttpsProxy": "", "NoProxy": "", "Name": "master1", "Labels": null,
	 * "ExperimentalBuild": false, "ServerVersion": "1.13.0", "ClusterStore":
	 * "", "ClusterAdvertise": "", "Runtimes": {}, "DefaultRuntime": "runc",
	 * "Swarm": {}, "LiveRestoreEnabled": false, "Isolation": "", "InitBinary":
	 * "docker-init", "ContainerdCommit": {}, "RuncCommit": {}, "InitCommit":
	 * {}, "SecurityOptions": []
	 */

	public int getDhostId() {
		return dhostId;
	}

	public void setDhostId(int dhostId) {
		this.dhostId = dhostId;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getContainers() {
		return containers;
	}

	public void setContainers(int containers) {
		this.containers = containers;
	}

	public int getContainersRunning() {
		return containersRunning;
	}

	public void setContainersRunning(int containersRunning) {
		this.containersRunning = containersRunning;
	}

	public int getContainersPaused() {
		return containersPaused;
	}

	public void setContainersPaused(int containersPaused) {
		this.containersPaused = containersPaused;
	}

	public int getContainersStopped() {
		return containersStopped;
	}

	public void setContainersStopped(int containersStopped) {
		this.containersStopped = containersStopped;
	}

	public int getImages() {
		return images;
	}

	public void setImages(int images) {
		this.images = images;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public JSONObject getDriverStatus() {
		return driverStatus;
	}

	public void setDriverStatus(JSONObject driverStatus) {
		this.driverStatus = driverStatus;
	}

	public JSONObject getSystemStatus() {
		return systemStatus;
	}

	public void setSystemStatus(JSONObject systemStatus) {
		this.systemStatus = systemStatus;
	}

	public JSONObject getPlugins() {
		return plugins;
	}

	public void setPlugins(JSONObject plugins) {
		this.plugins = plugins;
	}

	public boolean isMemoryLimit() {
		return memoryLimit;
	}

	public void setMemoryLimit(boolean memoryLimit) {
		this.memoryLimit = memoryLimit;
	}

	public boolean isSwapLimit() {
		return swapLimit;
	}

	public void setSwapLimit(boolean swapLimit) {
		this.swapLimit = swapLimit;
	}

	public boolean isKernelMemory() {
		return kernelMemory;
	}

	public void setKernelMemory(boolean kernelMemory) {
		this.kernelMemory = kernelMemory;
	}

	public boolean isCpuCfsPeriod() {
		return cpuCfsPeriod;
	}

	public void setCpuCfsPeriod(boolean cpuCfsPeriod) {
		this.cpuCfsPeriod = cpuCfsPeriod;
	}

	public boolean isCpuCfsQuota() {
		return cpuCfsQuota;
	}

	public void setCpuCfsQuota(boolean cpuCfsQuota) {
		this.cpuCfsQuota = cpuCfsQuota;
	}

	public boolean iscPUShares() {
		return cPUShares;
	}

	public void setcPUShares(boolean cPUShares) {
		this.cPUShares = cPUShares;
	}

	public boolean iscPUSet() {
		return cPUSet;
	}

	public void setcPUSet(boolean cPUSet) {
		this.cPUSet = cPUSet;
	}

	public boolean isiPv4Forwarding() {
		return iPv4Forwarding;
	}

	public void setiPv4Forwarding(boolean iPv4Forwarding) {
		this.iPv4Forwarding = iPv4Forwarding;
	}

	public boolean isBridgeNfIptables() {
		return bridgeNfIptables;
	}

	public void setBridgeNfIptables(boolean bridgeNfIptables) {
		this.bridgeNfIptables = bridgeNfIptables;
	}

	public boolean isBridgeNfIp6tables() {
		return bridgeNfIp6tables;
	}

	public void setBridgeNfIp6tables(boolean bridgeNfIp6tables) {
		this.bridgeNfIp6tables = bridgeNfIp6tables;
	}

	public boolean isDebug() {
		return debug;
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	public int getnFd() {
		return nFd;
	}

	public void setnFd(int nFd) {
		this.nFd = nFd;
	}

	public boolean isOomKillDisable() {
		return oomKillDisable;
	}

	public void setOomKillDisable(boolean oomKillDisable) {
		this.oomKillDisable = oomKillDisable;
	}

}
