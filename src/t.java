import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class t implements Runnable {
	
	private uf a;
	public gd[] idxCacheFileIndex;
	private static String userHome;
	private Thread thread;
	private boolean e = false;
	private File f = null;
	private fd g = null;
	private fd h = null;
	public gd i = null;
	public gd dat2CacheFile = null;
	public static String javaVersion;
	public File l = null;
	public Applet m = null;
	public static Method setFocusTraversalKeysEnabled;
	public static int o = 3;
	public static Method setFocusCycleRoot;
	public gd idx255CacheFile = null;
	public static String javaVendor;
	public EventQueue eventQueue;
	
	public final fd a(int var1, URL var2) {
		try {
			if (var1 > -7) {
				this.a((String) null, 1, 123);
			}
			
			return this.a(0, 0, var2, 4, 14176);
		} catch (RuntimeException var4) {
			throw var4;
		}
	}
	
	public final uf a(int var1) {
		try {
			if (var1 != 0) {
				this.a(-97);
			}
			
			return this.a;
		} catch (RuntimeException var3) {
			throw var3;
		}
	}
	
	public final void a(boolean var1) {
		synchronized (this) {
			this.e = var1;
			this.notifyAll();
		}
		
		try {
			this.thread.join();
		} catch (InterruptedException var14) {
			var14.printStackTrace();
		}
		
		if (this.dat2CacheFile != null) {
			try {
				this.dat2CacheFile.b((byte) 49);
			} catch (IOException var13) {
				var13.printStackTrace();
			}
		}
		
		if (this.idx255CacheFile != null) {
			try {
				this.idx255CacheFile.b((byte) 67);
			} catch (IOException var12) {
				var12.printStackTrace();
			}
		}
		
		if (this.idxCacheFileIndex != null) {
			for (int var2 = 0; ~var2 > ~this.idxCacheFileIndex.length; ++var2) {
				if (this.idxCacheFileIndex[var2] != null) {
					try {
						this.idxCacheFileIndex[var2].b((byte) -92);
					} catch (IOException var11) {
						var11.printStackTrace();
					}
				}
			}
		}
		
		if (this.i != null) {
			try {
				this.i.b((byte) 62);
			} catch (IOException var10) {
				var10.printStackTrace();
			}
		}
	}
	
	private fd a(int unused, int i, Object o, int i1, int dummy) {
		if (dummy != 14176) {
			this.a(null, null, true);
		}
		
		fd var6 = new fd();
		var6.c = i;
		var6.a = o;
		var6.f = i1;
		synchronized (this) {
			if (this.h == null) {
				this.h = this.g = var6;
			} else {
				this.h.b = var6;
				this.h = var6;
			}
			this.notify();
		}
		
		return var6;
	}
	
	public final fd a(int var1, byte var2) {
		try {
			return var2 < 20 ? null : this.a(0, var1, (Object) null, 3, 14176);
		} catch (RuntimeException var4) {
			throw var4;
		}
	}
	
	public final fd a(int unused, int i, Runnable runnable) {
		return this.a(0, i, runnable, 2, 14176);
	}
	
	public final fd a(byte var1, String var2, Class var3, Class[] var4) {
		try {
			if (var1 >= -101) {
				this.a(-89);
			}
			
			return this.a(0, 0, new Object[] {var3, var2, var4}, 8, 14176);
		} catch (RuntimeException var6) {
			throw var6;
		}
	}
	
	private void a(String gameName, int idxCount, byte unused, int storeId) {
		if (storeId < 32 || ~storeId < -35) {
			storeId = 32;
		}
		
		String[] childDirs = new String[] {".jagex_cache_" + storeId, ".file_store_" + storeId};
		String[] parentDirs = new String[] {"./"/*"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", c, "/tmp/", ""*/};
		for (int count = 0; ~count > -3; ++count) {
			for (int childCount = 0; ~childDirs.length < ~childCount; ++childCount) {
				for (int parentCount = 0; ~parentDirs.length < ~parentCount; ++parentCount) {
					try {
						String parentFile = parentDirs[parentCount];
						if (parentFile.length() > 0 && !(new File(parentFile)).exists()) {
							continue;
						}
						
						File fullDirectory = new File(parentFile + childDirs[childCount]);
						boolean mkdir;
						if (~count == -2 && !fullDirectory.exists()) {
							mkdir = fullDirectory.mkdir();
							if (!mkdir) {
								continue;
							}
						}
						
						File cacheFile;
						if (this.i == null) {
							try {
								cacheFile = new File(fullDirectory, "random.dat");
								if (count == 1 || cacheFile.exists()) {
									this.i = new gd(cacheFile, "rw", 25L);
								}
							} catch (Exception e) {
								this.i = null;
								e.printStackTrace();
							}
						}
						
						if (this.f == null) {
							try {
								fullDirectory = new File(fullDirectory, gameName);
								if (count == 1 && !fullDirectory.exists()) {
									mkdir = fullDirectory.mkdir();
									if (!mkdir) {
										continue;
									}
								}
								
								cacheFile = new File(fullDirectory, "main_file_cache.dat2");
								if (count == 0 && !cacheFile.exists()) {
									continue;
								}
								
								this.dat2CacheFile = new gd(cacheFile, "rw", 104857600L);
								this.idxCacheFileIndex = new gd[idxCount];
								
								for (int idxId = 0; ~idxCount < ~idxId; ++idxId) {
									this.idxCacheFileIndex[idxId] = new gd(
											new File(fullDirectory, "main_file_cache.idx" + idxId), "rw", 1048576L);
								}
								
								this.idx255CacheFile = new gd(new File(fullDirectory, "main_file_cache.idx255"), "rw", 1048576L);
								this.l = this.f = fullDirectory;
							} catch (Exception e) {
								e.printStackTrace();
								try {
									//Close
									this.dat2CacheFile.b((byte) -90);
									
									for (int idxId = 0; ~idxCount < ~idxId; ++idxId) {
										this.idxCacheFileIndex[idxId].b((byte) 101);
									}
									
									this.idx255CacheFile.b((byte) 70);
								} catch (Exception e1) {
									e1.printStackTrace();
								}
								
								this.l = this.f = null;
								this.dat2CacheFile = this.idx255CacheFile = null;
								this.idxCacheFileIndex = null;
							}
						}
					} catch (Exception e2) {
						e2.printStackTrace();
					}
					
					if (this.i != null && this.f != null) {
						return;
					}
				}
			}
		}
		
		if (this.f == null) {
			throw new RuntimeException();
		}
	}
	
	@SuppressWarnings("unchecked")
	public final void run() {
		System.err.println("Method run() [Class t]");
		while (true) {
			fd var1;
			synchronized (this) {
				label120: {
					while (!this.e) {
						if (this.g != null) {
							var1 = this.g;
							this.g = this.g.b;
							if (this.g == null) {
								this.h = null;
							}
							break label120;
						}
						
						try {
							this.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					return;
				}
			}
							
			try {
				int var2 = var1.f;
				if (~var2 != -2) {
					if (var2 == 2) {
						Thread thread = new Thread((Runnable) var1.a);
						thread.setDaemon(true);
						thread.start();
						thread.setPriority(var1.c);
						var1.e = thread;
					} else if (~var2 != -5) {
						Object[] objects;
						if (var2 == 8) {
							objects = (Object[]) var1.a;
							var1.e = ((Class) objects[0]).getDeclaredMethod((String) objects[1], (Class[]) objects[2]);
						} else {
							if (var2 != 9) {
								throw new Exception();
							}
							
							objects = (Object[]) var1.a;
							var1.e = ((Class) objects[0]).getDeclaredField((String) objects[1]);
						}
					} else {
						var1.e = new DataInputStream(((URL) var1.a).openStream());
					}
				} else {
					var1.e = new Socket(InetAddress.getByName((String) var1.a), var1.c);
				}
				
				var1.d = 1;
			} catch (ThreadDeath threadDeath) {
				throw threadDeath;
			} catch (Throwable throwable) {
				throwable.printStackTrace();
				var1.d = 2;
			}
		}
	}
	
	public final fd a(String address, int port, int unused) {
		return this.a(0, port, address, 1, 14176);
	}
	
	public final fd a(String var1, Class var2, boolean var3) {
		try {
			return var3 ? null : this.a(0, 0, new Object[] {var2, var1}, 9, 14176);
		} catch (RuntimeException var5) {
			throw var5;
		}
	}
	
	public t(boolean loadCache, Applet applet, int storeId, String gameName, int idxCount) {
		javaVendor = "Unknown";
		this.m = applet;
		javaVersion = "1.1";
		
		try {
			javaVendor = System.getProperty("java.vendor");
			javaVersion = System.getProperty("java.version");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			userHome = System.getProperty("user.home");
			if (userHome != null) {
				userHome = userHome + "/";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (userHome == null) {
			userHome = "~/";
		}
		
		try {
			this.eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		
		try {
			if (applet == null) {
				setFocusTraversalKeysEnabled = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				setFocusTraversalKeysEnabled = applet.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			if (applet == null) {
				setFocusCycleRoot = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				setFocusCycleRoot = applet.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (loadCache) {
			this.a(gameName, idxCount, (byte) -46, storeId);
		}
		
		this.e = false;
		this.thread = new Thread(this);
		this.thread.setPriority(10);
		this.thread.setDaemon(true);
		this.thread.start();
	}
}
