import java.awt.event.ActionEvent;

final class kd extends af {
	
	static int R;
	static int S;
	private int T = 0;
	static int U = 99;
	private static ob V = rf.a(40, "Continue");
	static int[] W = new int[200];
	static ob X = rf.a(40, "0(U");
	static ob Y = rf.a(40, "Ung-Ultiger Benutzername");
	static short[] Z;
	static int ab;
	static int bb;
	static int cb;
	private int db = 4096;
	static int eb;
	static int fb;
	static ob gb;
	
	public static void b(byte var0) {
		try {
			V = null;
			Z = null;
			X = null;
			gb = null;
			Y = null;
			if (var0 != -37) {
				i(-68);
			}
			
			W = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "kd.A(" + var0 + ')');
		}
	}
	
	static void a(int var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
		int var8 = client.anInt_wb;
		
		try {
			label37:
			{
				if (~gh.R >= ~var5 && ng.u >= var2 && dd.a <= var3 && var4 <= na.anInt_m) {
					if (~var0 != -2) {
						ua.a(var1, var3, var5, 3963, var4, var0, var2);
						if (var8 == 0) {
							break label37;
						}
					}
					
					o.a(var3, var2, var4, 4243, var1, var5);
					if (var8 == 0) {
						break label37;
					}
				}
				
				if (~var0 == -2) {
					ei.b(var2, 1, var1, var4, var3, var5);
					if (var8 == 0) {
						break label37;
					}
				}
				
				pc.a(var5, var3, var1, 0, var0, var4, var2);
			}
			
			++cb;
		} catch (RuntimeException var9) {
			throw bc.a(var9, "kd.H(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ')');
		}
	}
	
	static void a(ud var0, int var1) {
		int var10 = client.anInt_wb;
		
		try {
			++eb;
			var0.P = var0.Jb;
			if (var0.T == 0) {
				var0.rb = 0;
			} else {
				if (var0.mb != -1 && var0.wb == 0) {
					ce var2 = le.c(15619, var0.mb);
					if (~var0.cc < -1 && ~var2.V == -1) {
						++var0.rb;
						return;
					}
					
					if (var0.cc <= 0 && var2.Y == 0) {
						++var0.rb;
						return;
					}
				}
				
				int var12 = var0.coordX;
				int var3 = var0.coordY;
				int var5 = 128 * var0.regionLocalY[var0.T + -1] + var0.Gb * 64;
				int var4 = 128 * var0.regionLocalX[-1 + var0.T] + 64 * var0.Gb;
				if (var4 - var12 <= 256 && ~(-var12 + var4) <= 255 && ~(-var3 + var5) >= -257 && -var3 + var5 >= -256) {
					label231:
					{
						if (~var4 < ~var12) {
							if (~var3 > ~var5) {
								var0.U = 1280;
								if (var10 == 0) {
									break label231;
								}
							}
							
							if (var3 > var5) {
								var0.U = 1792;
								if (var10 == 0) {
									break label231;
								}
							}
							
							var0.U = 1536;
							if (var10 == 0) {
								break label231;
							}
						}
						
						if (~var4 <= ~var12) {
							if (~var5 >= ~var3) {
								if (~var3 >= ~var5) {
									break label231;
								}
								
								var0.U = 0;
								if (var10 == 0) {
									break label231;
								}
							}
							
							var0.U = 1024;
							if (var10 == 0) {
								break label231;
							}
						}
						
						if (var5 <= var3) {
							if (var5 >= var3) {
								var0.U = 512;
								if (var10 == 0) {
									break label231;
								}
							}
							
							var0.U = 256;
							if (var10 == 0) {
								break label231;
							}
						}
						
						var0.U = 768;
					}
					
					int var6 = -var0.gb + var0.U & 2047;
					if (~var6 < -1025) {
						var6 -= 2048;
					}
					
					int var7;
					int var8;
					label243:
					{
						var8 = 4;
						var7 = var0.ub;
						if (var6 >= -256 && ~var6 >= -257) {
							var7 = var0.Y;
							if (var10 == 0) {
								break label243;
							}
						}
						
						if (var6 < 256 || ~var6 <= -769) {
							if (var6 < -768 || ~var6 < 255) {
								break label243;
							}
							
							var7 = var0.vb;
							if (var10 == 0) {
								break label243;
							}
						}
						
						var7 = var0.jb;
					}
					
					boolean var9 = true;
					if (var7 == -1) {
						var7 = var0.Y;
					}
					
					var0.P = var7;
					if (var0 instanceof nb) {
						var9 = ((nb) var0).pc.ab;
					}
					
					label235:
					{
						if (var9) {
							if (var0.gb != var0.U && var0.Mb == -1 && var0.ab != 0) {
								var8 = 2;
							}
							
							if (var0.T > 2) {
								var8 = 6;
							}
							
							if (~var0.T < -4) {
								var8 = 8;
							}
							
							if (~var0.rb >= -1 || ~var0.T >= -2) {
								break label235;
							}
							
							--var0.rb;
							var8 = 8;
							if (var10 == 0) {
								break label235;
							}
						}
						
						if (var0.T > 1) {
							var8 = 6;
						}
						
						if (~var0.T < -3) {
							var8 = 8;
						}
						
						if (var0.rb > 0 && ~var0.T < -2) {
							--var0.rb;
							var8 = 8;
						}
					}
					
					if (var0.Eb[-1 + var0.T]) {
						var8 <<= 1;
					}
					
					label155:
					{
						if (~var5 < ~var3) {
							var0.coordY += var8;
							if (var5 >= var0.coordY) {
								break label155;
							}
							
							var0.coordY = var5;
							if (var10 == 0) {
								break label155;
							}
						}
						
						if (~var5 > ~var3) {
							var0.coordY -= var8;
							if (~var0.coordY > ~var5) {
								var0.coordY = var5;
							}
						}
					}
					
					if (~var8 <= -9 && var0.P == var0.Y && ~var0.tb != 0) {
						var0.P = var0.tb;
					}
					
					if (var1 < -3) {
						label145:
						{
							if (var12 >= var4) {
								if (~var4 <= ~var12) {
									break label145;
								}
								
								var0.coordX -= var8;
								if (var0.coordX >= var4) {
									break label145;
								}
								
								var0.coordX = var4;
								if (var10 == 0) {
									break label145;
								}
							}
							
							var0.coordX += var8;
							if (~var4 > ~var0.coordX) {
								var0.coordX = var4;
							}
						}
						
						if (var0.coordX == var4 && ~var0.coordY == ~var5) {
							if (~var0.cc < -1) {
								--var0.cc;
							}
							
							--var0.T;
						}
					}
				} else {
					var0.coordX = var4;
					var0.coordY = var5;
				}
			}
		} catch (RuntimeException var11) {
			throw bc.a(var11, "kd.C(" + "{...}" + ',' + var1 + ')');
		}
	}
	
	static void a(t var0, Object var1, byte var2) {
		int var4 = client.anInt_wb;
		
		try {
			++fb;
			if (var0.eventQueue != null) {
				if (var2 != 2) {
					W = null;
				}
				
				int var3 = 0;
				while (~var3 > -51 && var0.eventQueue.peekEvent() != null) {
					jd.a(1L, (byte) -8);
					++var3;
				}
				
				if (var1 != null) {
					var0.eventQueue.postEvent(new ActionEvent(var1, 1001, "dummy"));
				}
			}
		} catch (RuntimeException var5) {
			throw bc.a(var5, "kd.D(" + "{...}" + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}
	
	public kd() {
		super(1, true);
	}
	
	final void a(int var1, int var2, og var3) {
		int var5 = client.anInt_wb;
		
		try {
			label30:
			{
				label29:
				{
					++R;
					if (~var1 != -1) {
						if (var1 != 1) {
							break label30;
						}
						
						if (var5 == 0) {
							break label29;
						}
					}
					
					this.T = var3.readShort(76);
					if (var5 == 0) {
						break label30;
					}
				}
				
				this.db = var3.readShort(34);
			}
			
		} catch (RuntimeException var6) {
			throw bc.a(var6, "kd.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	final int[] a(byte var1, int var2) {
		int var7 = client.anInt_wb;
		
		try {
			++bb;
			if (var1 < 13) {
				b((byte) 12);
			}
			
			int[] var3 = super.nd_v.a(var2, 12);
			if (super.nd_v.n) {
				int[] var4 = this.c(var2, 0, 25);
				int var5 = 0;
				if (var7 != 0 || ~lh.eb < ~var5) {
					do {
						int var6 = var4[var5];
						var3[var5] = this.T <= var6 ? (~this.db > ~var6 ? 0 : 4096) : 0;
						++var5;
					} while (~lh.eb < ~var5);
				}
			}
			
			return var3;
		} catch (RuntimeException var8) {
			throw bc.a(var8, "kd.F(" + var1 + ',' + var2 + ')');
		}
	}
	
	static void i(int unused) {
		try {
			ab += 1;
			int playerListSize = pg.packetBuffer.readBits(8, 11339);
			System.out.println("PlayerListSize: " + playerListSize);
			if ((~playerListSize) > (~se.b)) {
				j = playerListSize;
				while ((~j) > (~se.b)) {
					ue.gb[(nf.S++)] = si.cb[j];
					j++;
				}
			}
			System.out.println("GPPOV1: " + se.b + " " + playerListSize);
			if (~se.b > ~playerListSize) {
				throw new RuntimeException("gppov1");
			}
			se.b = 0;
			int j = 0;
			while (playerListSize > j) {
				int k = si.cb[j];
				dg localdg = lg.j[k];
				int m = pg.packetBuffer.readBits(1, 11339);
				if (m == 0) {
					si.cb[(se.b++)] = k;
					localdg.Ub = bi.f;
				} else {
					int n = pg.packetBuffer.readBits(2, 11339);
					if (n == 0) {
						si.cb[(se.b++)] = k;
						localdg.Ub = bi.f;
						mf.nb[(qf.I++)] = k;
					} else {
						int i1;
						int i2;
						if (n == 1) {
							si.cb[(se.b++)] = k;
							localdg.Ub = bi.f;
							i1 = pg.packetBuffer.readBits(3, 11339);
							localdg.a(true, i1, false);
							i2 = pg.packetBuffer.readBits(1, 11339);
							if (i2 == 1) {
								mf.nb[(qf.I++)] = k;
							}
						} else if ((~n) == -3) {
							si.cb[(se.b++)] = k;
							localdg.Ub = bi.f;
							i1 = pg.packetBuffer.readBits(3, 11339);
							localdg.a(true, i1, true);
							i2 = pg.packetBuffer.readBits(3, 11339);
							localdg.a(true, i2, true);
							int i3 = pg.packetBuffer.readBits(1, 11339);
							if (i3 == 1) {
								mf.nb[(qf.I++)] = k;
							}
						} else if (n == 3) {
							ue.gb[(nf.S++)] = k;
						}
					}
				}
				j++;
			}
		} catch (RuntimeException localRuntimeException) {
			throw bc.a(localRuntimeException, "kd.E(" + unused + ')');
		}
		
	}
	
	static {
		gb = V;
	}
}
