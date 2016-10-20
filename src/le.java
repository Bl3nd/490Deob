import java.io.IOException;
import java.net.Socket;

final class le extends af {
	
	static int R;
	static int S;
	static dg T;
	static ob password_2;
	static ob V;
	static int W;
	static boolean X;
	static int Y;
	static int Z;
	private static ob password_ = rf.a(40, "Password: ");
	static int bb;
	static ob cb = rf.a(40, "<col=ff9040>");
	static int[] db;
	static int eb;
	static int anInt_fb;
	static ob gb = rf.a(40, "<col=ff3000>");
	static ob hb;
	static int ib;
	private static ob jb = rf.a(40, "Please use a different world)3");
	
	static void i(int unused) {
		int dummy = client.anInt_wb;
		
		try {
			++S;
			
			try {
				if (e.e == 0) {
					if (ch.W != null) {
						ch.W.b(-2);
						ch.W = null;
					}
					
					ng.o = null;
					rc.c = 0;
					e.e = 1;
					gf.x = false;
				} else if (e.e == 1) {
					if (ng.o == null) {
						ng.o = gi.y.a(ei.Eb, qe.s, -90);
					}
					
					if (ng.o.d == 2) {
						throw new IOException();
					} else if (ng.o.d == 1) {
						ch.W = new ph((Socket) ng.o.e, gi.y);
						e.e = 2;
						ng.o = null;
					}
				} else if (e.e == 2) {
					long l = r.X = kf.l.e(19790);
					af.P.pointer = 0;
					int i = (int) (l >> 16 & 31L);
					af.P.writeByte(89, 14);
					af.P.writeByte(118, i);
					ch.W.a(39, af.P.buffer, 2, 0);
					pg.packetBuffer.pointer = 0;
					e.e = 3;
				}
				
				int len;
				if (e.e == 3) {
					if (client.lg_rb != null) {
						client.lg_rb.b(0);
					}
					
					if (mf.mb != null) {
						mf.mb.b(0);
					}
					
					len = ch.W.read(-120);
					if (client.lg_rb != null) {
						client.lg_rb.b(0);
					}
					
					if (mf.mb != null) {
						mf.mb.b(0);
					}
					
					if (len != 0) {
						qc.b(1, len);
						return;
					}
					
					e.e = 4;
					pg.packetBuffer.pointer = 0;
				} else if (e.e == 4) {
					if (~pg.packetBuffer.pointer > -9) {
						len = ch.W.available(0);
						if (~(8 - pg.packetBuffer.pointer) > ~len) {
							len = 8 + -pg.packetBuffer.pointer;
						}
						
						if (len > 0) {
							System.err.println("len " + len);
							ch.W.read(len, (byte) 8, pg.packetBuffer.buffer, pg.packetBuffer.pointer);
							pg.packetBuffer.pointer += len;
						}
					}
					
					if (pg.packetBuffer.pointer == 8) {
						pg.packetBuffer.pointer = 0;
						ef.W = pg.packetBuffer.readLong(516491232);
						System.err.println("ef.W " + ef.W);
						e.e = 5;
					}
				} else if (e.e == 5) {
					int[] isaacKeys;
					af.P.pointer = 0;
					isaacKeys = new int[] {(int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (ef.W >> 32), (int) ef.W};
					af.P.writeByte(77, 10);
					af.P.writeInt(isaacKeys[0], (byte) 4);
					af.P.writeInt(isaacKeys[1], (byte) 108);
					af.P.writeInt(isaacKeys[2], (byte) -124);
					af.P.writeInt(isaacKeys[3], (byte) 28);
					af.P.writeLong(-114, kf.l.e(19790));
					af.P.writeString(kf.f, (byte) -124);
					af.P.a((byte) 110, sb.U, hh.F);
					ve.p.pointer = 0;
					if (qb.gameState == 40) {
						ve.p.writeByte(76, 18);
					} else {
						ve.p.writeByte(71, 16);
					}
					ve.p.writeByte(97, af.P.pointer + 125 + hi.a(97, ig.i));
					ve.p.writeInt(490, (byte) 18);
					ve.p.writeByte(69, ag.forceSend ? 1 : 0);
					vg.a((byte) -128, ve.p);
					ve.p.writeString(ig.i, (byte) 59);
					ve.p.writeInt(qa.D, (byte) 59);
					ve.p.writeInt(cc.cacheFile_0.X, (byte) -128);
					ve.p.writeInt(rh.cacheFile_1.X, (byte) 75);
					ve.p.writeInt(gi.cacheFile_2.X, (byte) 77);
					ve.p.writeInt(ad.cacheFile_3.X, (byte) -124);
					ve.p.writeInt(hi.cacheFile_4.X, (byte) 18);
					ve.p.writeInt(mf.cacheFile_5.X, (byte) -127);
					ve.p.writeInt(q.cacheFile_6.X, (byte) 95);
					ve.p.writeInt(qa.cacheFile_7.X, (byte) 4);
					ve.p.writeInt(l.cacheFile_8.X, (byte) -128);
					ve.p.writeInt(pa.cacheFile_9.X, (byte) -122);
					ve.p.writeInt(fh.cacheFile_10.X, (byte) 105);
					ve.p.writeInt(qe.cacheFile_11.X, (byte) -23);
					ve.p.writeInt(jg.cacheFile_12.X, (byte) -122);
					ve.p.writeInt(ve.cacheFile_13.X, (byte) -16);
					ve.p.writeInt(pi.cacheFile_14.X, (byte) -116);
					ve.p.writeInt(wd.cacheFile_15.X, (byte) 107);
					ve.p.writeInt(hc.cacheFile_16.X, (byte) -116);
					ve.p.writeInt(sf.cacheFile_17.X, (byte) -9);
					ve.p.writeInt(ki.cacheFile_18.X, (byte) 8);
					ve.p.writeInt(od.cacheFile_19.X, (byte) -124);
					ve.p.writeInt(me.cacheFile_20.X, (byte) -126);
					ve.p.writeInt(hg.cacheFile_21.X, (byte) 80);
					ve.p.writeInt(pc.cacheFile_22.X, (byte) -123);
					ve.p.writeBytes(af.P.pointer, af.P.buffer, 2, 0);
					ch.W.a(39, ve.p.buffer, ve.p.pointer, 0);
					af.P.a(isaacKeys, -3197);
					int count = 0;
					if (/*dummy != 0 || */~count > -5) {
						do {
							isaacKeys[count] += 50;
							++count;
						} while (~count > -5);
					}
					
					pg.packetBuffer.a(isaacKeys, -3197);
					e.e = 6;
				} else if (e.e == 6 && ~ch.W.available(0) < -1) {
					len = ch.W.read(-120);
					System.out.println("Response opcode: " + len);
					if (len == 21 && qb.gameState == 20) {
						e.e = 7;
					}
					
					if (len != 2) {
						if (len == 15 && qb.gameState == 40) {
							ja.d((byte) 0);
							return;
						}
						
						if (len != 23 || ce.F >= 1) {
							qc.b(1, len);
							return;
						}
						
						e.e = 0;
						++ce.F;
					} else {
						e.e = 9;
					}
				} else if (e.e == 7 && ~ch.W.available(0) < -1) {
					c.S = 60 * (3 + ch.W.read(10));
					e.e = 8;
				} else if (e.e == 8) {
					rc.c = 0;
					c.a(wc.a(new ob[] {hh.a((byte) 93, c.S / 60), ag.j}, 333485964 + -333485967), fb.youHaveOnlyJustLeftAnotherWorld2, rc.h, (byte) -70);
					if (~(--c.S) >= -1) {
						e.e = 0;
					}
				} else {
					if (e.e == 9 && ch.W.available(0) >= 9) {
						aa.F = ch.W.read(-120);
						cf.cb = ch.W.read(-121);
						sf.f = ch.W.read(110) == 1;
						jh.c = ch.W.read(-126);
						jh.c <<= 8;
						jh.c += ch.W.read(-123);
						n.k = ch.W.read(-28);
						ch.W.read(1, (byte) 96, pg.packetBuffer.buffer, 0);
						pg.packetBuffer.pointer = 0;
						gf.F = pg.packetBuffer.isBigOpcode(255);
						ch.W.read(2, (byte) -126, pg.packetBuffer.buffer, 0);
						pg.packetBuffer.pointer = 0;
						sh.packetSize = pg.packetBuffer.readShort(34);
						System.out.println("gf.F: " + gf.F + " aa.F: " + aa.F + " cf.cb: " + cf.cb + " sf.f: " + sf.f
								+ " jh.c: " + jh.c + " n.k: " + n.k + " packetSize: " + sh.packetSize);
						e.e = 10;
					} else if (e.e == 10) {
						if (~ch.W.available(0) <= ~sh.packetSize) {
							pg.packetBuffer.pointer = 0;
							ch.W.read(sh.packetSize, (byte) -126, pg.packetBuffer.buffer, 0);
							e.a(0);
							ci.regionX = -1;
							fi.a(false, (byte) -41);
							gf.F = -1;
						}
						
					} else {
						++rc.c;
						if (~rc.c < -2001) {
							if (~ce.F > -2) {
								++ce.F;
								e.e = 0;
								if (~qe.s != ~gi.w) {
									qe.s = gi.w;
								} else {
									qe.s = r.Y;
								}
							} else {
								qc.b(1, -3);
							}
						}
					}
				}
			} catch (IOException var5) {
				if (ce.F < 1) {
					++ce.F;
					e.e = 0;
					if (~qe.s == ~gi.w) {
						qe.s = r.Y;
					} else {
						qe.s = gi.w;
					}
				} else {
					qc.b(1, -2);
				}
			}
		} catch (RuntimeException var6) {
			throw bc.a(var6, "le.C(" + unused + ')');
		}
	}
	
	public le() {
		super(3, false);
	}
	
	final void a(int var1, int var2, og var3) {
		try {
			++eb;
			if (var1 == 0) {
				super.u = var3.readUnsignedByte(255) == 1;
			}
			
			int var4 = 123 / ((var2 - 66) / 57);
		} catch (RuntimeException var5) {
			throw bc.a(var5, "le.B(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}
	
	final int[][] b(int var1, byte var2) {
		int var20 = client.anInt_wb;
		
		try {
			++R;
			int var3 = -69 % ((-42 - var2) / 41);
			int[][] var4 = super.ve_s.a(var1, (byte) 45);
			if (super.ve_s.u) {
				int[] var5 = this.c(var1, 2, 59);
				int[][] var6 = this.b(var1, -93, 0);
				int[][] var7 = this.b(var1, -36, 1);
				int[] var8 = var4[0];
				int[] var9 = var4[1];
				int[] var10 = var4[2];
				int[] var11 = var6[0];
				int[] var12 = var6[1];
				int[] var13 = var6[2];
				int[] var15 = var7[1];
				int[] var16 = var7[2];
				int[] var14 = var7[0];
				int var17 = 0;
				if (var20 != 0 || var17 < lh.eb) {
					do {
						int var18 = var5[var17];
						if (~var18 == -4097) {
							var8[var17] = var11[var17];
							var9[var17] = var12[var17];
							var10[var17] = var13[var17];
							if (var20 == 0) {
								++var17;
								continue;
							}
						}
						
						if (var18 == 0) {
							var8[var17] = var14[var17];
							var9[var17] = var15[var17];
							var10[var17] = var16[var17];
							if (var20 == 0) {
								++var17;
								continue;
							}
						}
						
						int var19 = 4096 + -var18;
						var8[var17] = var14[var17] * var19 + var11[var17] * var18 >> 12;
						var9[var17] = var12[var17] * var18 + var15[var17] * var19 >> 12;
						var10[var17] = var18 * var13[var17] - -(var19 * var16[var17]) >> 12;
						++var17;
					} while (var17 < lh.eb);
				}
			}
			
			return var4;
		} catch (RuntimeException var21) {
			throw bc.a(var21, "le.G(" + var1 + ',' + var2 + ')');
		}
	}
	
	static ce c(int var0, int id) {
		try {
			++W;
			ce class_ce = (ce) nf.eb.a((long) id, (byte) 92);
			if (class_ce != null) {
				return class_ce;
			} else {
				byte[] data = ai.cacheFile20.a((byte) -117, fb.c(id, 127), rd.b(id, (byte) 104));
				class_ce = new ce();
				if (data != null) {
					class_ce.a(0, new og(data));
				}
				
				class_ce.f(99);
				nf.eb.a(class_ce, (byte) -27, (long) id);
				return class_ce;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "le.D(" + var0 + ',' + id + ')');
		}
	}
	
	static void j(int var0) {
		int var11 = client.anInt_wb;
		
		try {
			int var1;
			label127:
			{
				var1 = qg.c + T.coordX;
				if (fi.t[96]) {
					ab.c += (-ab.c + -24) / 2;
					if (var11 == 0) {
						break label127;
					}
				}
				
				if (fi.t[97]) {
					ab.c += (-ab.c + 24) / 2;
					if (var11 == 0) {
						break label127;
					}
				}
				
				ab.c /= 2;
			}
			
			label128:
			{
				ve.anInt_l = ab.c / 2 + ve.anInt_l & var0;
				if (fi.t[98]) {
					v.tb += (12 - v.tb) / 2;
					if (var11 == 0) {
						break label128;
					}
				}
				
				if (fi.t[99]) {
					v.tb += (-v.tb + -12) / 2;
					if (var11 == 0) {
						break label128;
					}
				}
				
				v.tb /= 2;
			}
			
			++ib;
			int var2 = T.coordY + a.a;
			if (~(-var1 + ka.D) > 499 || ~(-var1 + ka.D) < -501 || ~(wg.W - var2) > 499 || wg.W + -var2 > 500) {
				ka.D = var1;
				wg.W = var2;
			}
			
			pe.ab += v.tb / 2;
			if (pe.ab < 128) {
				pe.ab = 128;
			}
			
			if (var1 != ka.D) {
				ka.D += (var1 + -ka.D) / 16;
			}
			
			int var3 = ka.D >> 7;
			if (~pe.ab < -384) {
				pe.ab = 383;
			}
			
			int var6 = 0;
			if (wg.W != var2) {
				wg.W += (-wg.W + var2) / 16;
			}
			
			int var4 = wg.W >> 7;
			int var5 = ug.a(gf.G, ka.D, (byte) 40, wg.W);
			int var7;
			if (~var3 < -4 && var4 > 3 && ~var3 > -101 && var4 < 100) {
				var7 = -4 + var3;
				if (var11 != 0 || var3 - -4 >= var7) {
					do {
						int var8 = var4 + -4;
						if (var11 != 0 || ~var8 >= ~(var4 - -4)) {
							do {
								int var9 = gf.G;
								if (~var9 > -4 && ~(qe.r[1][var7][var8] & 2) == -3) {
									++var9;
								}
								
								int var10 = var5 - d.D[var9][var7][var8];
								if (~var10 < ~var6) {
									var6 = var10;
								}
								
								++var8;
							} while (~var8 >= ~(var4 - -4));
						}
						
						++var7;
					} while (var3 - -4 >= var7);
				}
			}
			
			var7 = 192 * var6;
			if (~var7 < -98049) {
				var7 = 98048;
			}
			
			if (~var7 > -32769) {
				var7 = '耀';
			}
			
			if (~fg.l <= ~var7) {
				if (fg.l > var7) {
					fg.l += (-fg.l + var7) / 80;
				}
			} else {
				fg.l += (-fg.l + var7) / 24;
			}
			
		} catch (RuntimeException var12) {
			throw bc.a(var12, "le.E(" + var0 + ')');
		}
	}
	
	final int[] a(byte var1, int var2) {
		int var9 = client.anInt_wb;
		
		try {
			if (var1 <= 13) {
				T = null;
			}
			
			++Z;
			int[] var3 = super.nd_v.a(var2, 12);
			if (super.nd_v.n) {
				int[] var4 = this.c(var2, 0, 47);
				int[] var5 = this.c(var2, 1, 69);
				int[] var6 = this.c(var2, 2, 66);
				int var7 = 0;
				if (var9 != 0 || lh.eb > var7) {
					do {
						int var8 = var6[var7];
						if (var8 != 4096) {
							if (~var8 == -1) {
								var3[var7] = var5[var7];
								if (var9 == 0) {
									++var7;
									continue;
								}
							}
							
							var3[var7] = var4[var7] * var8 + var5[var7] * (4096 + -var8) >> 12;
							if (var9 != 0) {
								var3[var7] = var4[var7];
								++var7;
							} else {
								++var7;
							}
						} else {
							var3[var7] = var4[var7];
							++var7;
						}
					} while (lh.eb > var7);
				}
			}
			
			return var3;
		} catch (RuntimeException var10) {
			throw bc.a(var10, "le.F(" + var1 + ',' + var2 + ')');
		}
	}
	
	public static void k(int var0) {
		try {
			T = null;
			gb = null;
			jb = null;
			cb = null;
			password_2 = null;
			hb = null;
			V = null;
			if (var0 != 0) {
				bb = 56;
			}
			
			db = null;
			password_ = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "le.A(" + var0 + ')');
		}
	}
	
	static {
		hb = jb;
		V = jb;
		X = false;
		password_2 = password_;
	}
}
