import java.io.IOException;

final class ic extends rg {

	static ob D;
	static int E;
	static int F;
	static int entityYPosition;
	static ob I;
	static ob runescapeIsLoadingPleaseWait2;
	int K;
	private static ob L = rf.a(40, "Unable to connect)3");
	static int entityXPosition;
	static int O = 0;
	static int P;
	static int Q;
	static int[] R;
	private int S;
	private ob T;
	int U;
	static ob V;
	private md W;
	private static ob runescapeIsLoadingPleaseWait;
	static ob Y;
	static ob Z;
	static fa[] ab;
	static int bb;
	static ob cb;
	static int db;

	final ob b (int var1, int var2) {
		try {
			if (var2 > -20) {
				O = 69;
			}

			++P;
			if (this.W == null) {
				return this.T;
			} else {
				ld var3 = (ld) this.W.a((long) var1, 22346);
				return var3 == null ? this.T : var3.p;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ic.F(" + var1 + ',' + var2 + ')');
		}
	}

	private void a (byte var1, int var2, og var3) {
		int var9 = client.anInt_wb;

		try {
			label69:
			{
				if (~var2 == -2) {
					this.U = var3.readUnsignedByte(255);
					if (var9 == 0) {
						break label69;
					}
				}

				if (var2 != 2) {
					if (~var2 == -4) {
						this.T = var3.t(-19405);
						if (var9 == 0) {
							break label69;
						}
					}

					if (var2 == 4) {
						this.S = var3.readInt(1029109968);
						if (var9 == 0) {
							break label69;
						}
					}

					if (var2 != 5 && var2 != 6) {
						break label69;
					}

					int var5 = var3.readShort(37);
					this.W = new md(qh.a(var5, 25920));
					int var6 = 0;
					if (var9 != 0 || var5 > var6) {
						do {
							int var7;
							Object var8;
							label51:
							{
								var7 = var3.readInt(1029109968);
								if (~var2 == -6) {
									var8 = new ld(var3.t(-19405));
									if (var9 == 0) {
										break label51;
									}
								}

								var8 = new la(var3.readInt(1029109968));
							}

							this.W.a((vd) var8, (long) var7, true);
							++var6;
						} while (var5 > var6);
					}

					if (var9 == 0) {
						break label69;
					}
				}

				this.K = var3.readUnsignedByte(255);
			}

			++E;
		} catch (RuntimeException var10) {
			throw bc.a(var10, "ic.C(" + var1 + ',' + var2 + ',' + (var3 != null ? "{...}" : "null") + ')');
		}
	}

	final void a (int var1, og var2) {
		int var4 = client.anInt_wb;

		try {
			if (var1 != 15291) {
				this.W = null;
			}

			do {
				int var3 = var2.readUnsignedByte(255);
				if (var3 == 0) {
					break;
				}

				this.a((byte) 85, var3, var2);
			} while (var4 == 0);

			++Q;
		} catch (RuntimeException var5) {
			throw bc.a(var5, "ic.D(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ')');
		}
	}

	@SuppressWarnings("ConstantConditions")
	static boolean a (boolean var0) {
		int dummy = client.anInt_wb;

		try {
			++F;
			if (ch.W == null) {
				return false;
			} else {
				int var3;
				try {
					int var1 = ch.W.available(0);
					if (~var1 == -1) {
						return false;
					}

					if (gf.F == -1) {
						--var1;
						ch.W.read(1, (byte) -127, pg.packetBuffer.buffer, 0);
						pg.packetBuffer.pointer = 0;
						gf.F = pg.packetBuffer.isBigOpcode(255);
						sh.packetSize = di.c[gf.F];
						System.err.println("INCOMING PACKET: " + gf.F);
						System.err.println("Incoming Packet size: " + sh.packetSize);
					}

					if (sh.packetSize == -1) {
						if (var1 > 0) {
							ch.W.read(1, (byte) 101, pg.packetBuffer.buffer, 0);
							--var1;
							sh.packetSize = pg.packetBuffer.buffer[0] & 255;
						} else {
							return false;
						}
					} else if (sh.packetSize == -2) {
						if (var1 <= 1) {
							return false;
						} else {
							ch.W.read(2, (byte) 125, pg.packetBuffer.buffer, 0);
							var1 -= 2;
							pg.packetBuffer.pointer = 0;
							sh.packetSize = pg.packetBuffer.readShort(53);
						}
					}

					if (var1 < sh.packetSize) {
						return false;
					}

					pg.packetBuffer.pointer = 0;
					ch.W.read(sh.packetSize, (byte) 86, pg.packetBuffer.buffer, 0);
					tg.q = ff.ab;
					ed.anInt_g = 0;
					ff.ab = rd.O;
					rd.O = gf.F;
					int var22;

					if (gf.F == 56) {
						int i = 0;
						for (; lg.j.length > i; ++i) {
							if (lg.j[i] != null) {
								lg.j[i].mb = -1;
							}
						}

						for (int i1 = 0; ~i1 > ~ai.M.length; ++i1) {
							if (ai.M[i1] != null) {
								ai.M[i1].mb = -1;
							}
						}

						gf.F = -1;
						return true;
					} else if (gf.F == 88) {
						int i = pg.packetBuffer.readUnsignedByte(255);
						int i1 = i >> 6;
						ki class_ki = new ki();
						class_ki.f = i & 0x3f;
						class_ki.k = pg.packetBuffer.readUnsignedByte(255);
						if (~class_ki.k <= -1 && ~gg.u.length < ~class_ki.k) {
							if (class_ki.f == 1 || class_ki.f == 10) {
								class_ki.c = pg.packetBuffer.readShort(127);
							} else if (class_ki.f >= 2 && class_ki.f <= 6) {
								if (class_ki.f == 2) {
									class_ki.j = 64;
									class_ki.n = 64;
								} else if (class_ki.f == 3) {
									class_ki.j = 64;
									class_ki.n = 0;
								} else if (class_ki.f == 4) {
									class_ki.n = 128;
									class_ki.j = 64;
								} else if (class_ki.f == 5) {
									class_ki.j = 0;
									class_ki.n = 64;
								} else if (class_ki.f == 6) {
									class_ki.n = 64;
									class_ki.j = 128;
								}

								class_ki.f = 2;
								class_ki.g = pg.packetBuffer.readShort(76);
								class_ki.e = pg.packetBuffer.readShort(78);
								class_ki.d = pg.packetBuffer.readUnsignedByte(255);
							}

							ua.kis_a[i1] = class_ki;
						}

						gf.F = -1;
						return true;
					} else if (gf.F == 237) {
						pa.d = pg.packetBuffer.readUnsignedByte(255);
						le.bb = pg.packetBuffer.readUnsignedByte(255);
						gf.F = -1;
						return true;
					}

					int var24;
					ra var25;
					int var34;
					int var35;
					int var41;
					if (gf.F == 217) {
						int i = pg.packetBuffer.readInt(1029109968);
						int i1 = pg.packetBuffer.readShort(31);
						if (~i > 69999) {
							i1 += '\u8000';
						}

						if (i < 0) {
							var25 = null;
						} else {
							var25 = tc.b(i, -69);
						}

						if (var25 != null) {
							int i2 = 0;
							while (~var25.ints_tc.length < ~i2) {
								var25.ints_tc[i2] = 0;
								var25.fb[i2] = 0;
								++i2;
							}
						}

						kf.a(-25714, i1);
						int i2 = pg.packetBuffer.readShort(91);
						int i3 = 0;
						if (~i2 >= ~i3) {
							if (var25 != null) {
								dg.a(var25, -114);
							}

							na.c((byte) -77);
							ff.eb[bd.b(sf.h++, 31)] = bd.b(32767, i1);
							gf.F = -1;
							return true;
						}

						while (~i2 < ~i3) {
							int i4 = pg.packetBuffer.readUnsignedShortA((byte) -83);
							int i5 = pg.packetBuffer.readUnsignedByte(255);
							if (i5 == 255) {
								i5 = pg.packetBuffer.readInt_V1((byte) -70);
							}

							if (var25 != null && i3 < var25.ints_tc.length) {
								var25.ints_tc[i3] = i4;
								var25.fb[i3] = i5;
							}

							wb.a(i3, i4 - 1, i1, -20971, i5);
							++i3;
						}

						if (var25 != null) {
							dg.a(var25, -114);
						}

						na.c((byte) -77);
						ff.eb[bd.b(sf.h++, 31)] = bd.b(32767, i1);
						gf.F = -1;
						return true;
					} else if (gf.F == 114) {
						boolean flag = ~pg.packetBuffer.readUnsignedByte(255) == -2;
						int i = pg.packetBuffer.readInt(1029109968);
						ra class_ra = tc.b(i, -103);
						if (class_ra != null && flag != class_ra.E) {
							class_ra.E = flag;
							dg.a(class_ra, -126);
						}

						gf.F = -1;
						return true;
					}

					int var4;
					int var9;
					int var10;
					long var11;
					if (gf.F == 230) {
						int i = sh.packetSize + pg.packetBuffer.pointer;
						int i1 = pg.packetBuffer.readShort(42);
						int i2 = pg.packetBuffer.readShort(33);
						re class_re;
						if (i1 != bg.h) {
							bg.h = i1;
							qd.b(-19597, bg.h);
							lb.c(bg.h, -122);
							int i3 = 0;
							while (~i3 > -101) {
								ob.bb[i3] = true;
								++i3;
							}
						}

						for (; ~(i2--) < -1; class_re.o = true) {
							int i3 = pg.packetBuffer.readInt(1029109968);
							int i4 = pg.packetBuffer.readShort(62);
							int i5 = pg.packetBuffer.readUnsignedByte(255);
							class_re = (re) rd.J.a((long) i3, 22346);
							if (class_re != null && ~class_re.w != ~i4) {
								ba.a(class_re, 1, true);
								class_re = null;
							}

							if (class_re == null) {
								class_re = ra.a(i5, -114, i3, i4);
							}
						}

						re class_re2 = (re) rd.J.b((byte) 117);

						for (; class_re2 != null; class_re2 = (re) rd.J.a((byte) -33)) {
							if (!class_re2.o) {
								ba.a(class_re2, 1, true);
							} else {
								class_re2.o = false;
							}
						}

						tf.e = new md(512);
						if (pg.packetBuffer.pointer >= i) {
							gf.F = -1;
							return true;
						}

						do {
							var35 = pg.packetBuffer.readInt(1029109968);
							var34 = pg.packetBuffer.readShort(117);
							var41 = pg.packetBuffer.readShort(118);
							var9 = pg.packetBuffer.readInt(1029109968);
							var10 = var34;
							if (~var34 >= ~var41) {
								do {
									var11 = (long) var10 + ((long) var35 << 32);
									tf.e.a(new la(var9), var11, true);
									++var10;
								} while (~var10 >= ~var41);
							}
						} while (pg.packetBuffer.pointer < i);

						gf.F = -1;
						return true;
					}

					int var12;
					long var27;
					long var40;
					long var47;
					ob var52;
					if (~gf.F == -10) {
						var47 = pg.packetBuffer.readLong(516491232);
						boolean var51 = false;
						var40 = (long) pg.packetBuffer.readShort(113);
						var27 = (long) pg.packetBuffer.readUnsignedMedInt(34);
						long var50 = var27 + (var40 << 32);
						int playerRights = pg.packetBuffer.readUnsignedByte(255);
						for (int i = 0; ~i > -101; i++) {
							if (~ff.fb[i] == ~var50) {
								var51 = true;
								break;
							}
						}


						if (~playerRights >= -2) {
							int var53 = 0;
							if (var53 < jg.s) {
								do {
									if (~var47 == ~pe.db[var53]) {
										var51 = true;
										break;
									}

									++var53;
								} while (var53 < jg.s);
							}
						}

						if (!var51 && ~bh.c == -1) {
							ff.fb[wh.i] = var50;
							wh.i = (1 + wh.i) % 100;
							var52 = nh.a(s.a(pg.packetBuffer, true).h((byte) -43));
							if (playerRights == 2 || playerRights == 3) {
								nb.a(7, (byte) -107, wc.a(new ob[] {ib.d, ug.a(var47, 0).a(71)}, -3), var52);
							} else if (playerRights != 1) {
								nb.a(3, (byte) -106, ug.a(var47, 0).a(27), var52);
							} else {
								nb.a(7, (byte) -125, wc.a(new ob[] {v.cb, ug.a(var47, 0).a(94)}, -3), var52);
							}
						}

						gf.F = -1;
						return true;
					} else if (gf.F == 169) {
						gg.w = pg.packetBuffer.readUnsignedByte(255);
						ca.Qb = pg.packetBuffer.readUnsignedByte(255);
						ng.B = pg.packetBuffer.readUnsignedByte(255);
						gf.F = -1;
						return true;
					} else if (gf.F == 204) {
						jg.s = sh.packetSize / 8;
						int i = 0;
						if (~i <= ~jg.s) {
							a.k = re.D;
							gf.F = -1;
							return true;
						}

						do {
							pe.db[i] = pg.packetBuffer.readLong(516491232);
							qg.i[i] = ug.a(pe.db[i], 0);
							++i;
						} while (~i > ~jg.s);

						a.k = re.D;
						gf.F = -1;
						return true;
					}

					boolean var43;
					int var45;
					if (gf.F == 206) {
						kg.i = re.D;
						long l = pg.packetBuffer.readLong(516491232);
						if (~l == -1L) {
							ac.p = null;
							gf.F = -1;
							jh.e = null;
							sa.f = null;
							oc.d = 0;
							return true;
						}

						var40 = pg.packetBuffer.readLong(516491232);
						jh.e = ug.a(var40, 0);
						ac.p = ug.a(l, 0);
						me.f = pg.packetBuffer.readByte(1064893128);
						var35 = pg.packetBuffer.readUnsignedByte(255);
						if (~var35 == -256) {
							gf.F = -1;
							return true;
						}

						oc.d = var35;
						vf[] var60 = new vf[100];
						var41 = 0;
						for (; ~var41 > ~oc.d; ++var41) {
							var60[var41] = new vf();
							var60[var41].clientScriptId = pg.packetBuffer.readLong(516491232);
							var60[var41].o = ug.a(var60[var41].clientScriptId, 0);
							var60[var41].A = pg.packetBuffer.readShort(112);
							var60[var41].aByte_s = pg.packetBuffer.readByte(1064893128);
							var60[var41].y = pg.packetBuffer.t(-19405);
							if (~r.X == ~var60[var41].clientScriptId) {
								lh.U = var60[var41].aByte_s;
							}
						}

						var43 = false;
						var45 = oc.d;
						if (var45 > 0) {
							do {
								--var45;
								var43 = true;
								var12 = 0;
								if (var45 > var12) {
									do {
										if (var60[var12].o.c(var60[1 + var12].o, (byte) -119) > 0) {
											vf var49 = var60[var12];
											var60[var12] = var60[var12 - -1];
											var43 = false;
											var60[var12 + 1] = var49;
										}

										++var12;
									} while (var45 > var12);
								}
							} while ((!var43) && var45 > 0);
						}

						sa.f = var60;
						gf.F = -1;
						return true;
					} else if (gf.F == 8) {
						int paneId = pg.packetBuffer.readUnsignedShortA((byte) 124);
						bg.h = paneId;
						qd.b(-19597, paneId);
						lb.c(bg.h, 60);
						var3 = 0;
						while (~var3 > -101) {
							ob.bb[var3] = true;
							++var3;
						}

						gf.F = -1;
						return true;
					}

					ob var59;
					if (gf.F == 196) {
						int i = pg.packetBuffer.f(-711444088);
						int i1 = pg.packetBuffer.readUByteC((byte) -127);
						ob class_ob = pg.packetBuffer.t(-19405);
						if (i1 >= 1 && ~i1 >= -9) {
							if (class_ob.b((byte) -72, wg.jb)) {
								class_ob = null;
							}

							gg.o[-1 + i1] = class_ob;
							fh.c[i1 - 1] = ~i == -1;
						}

						gf.F = -1;
						return true;
					} else if (gf.F == 151) {
						int i = pg.packetBuffer.readUnsignedShortA((byte) -30);
						byte b = pg.packetBuffer.readByte(1064893128);
						ji.K[i] = b;
						if (b != sa.c[i]) {
							sa.c[i] = b;
							gi.a((byte) -92, i);
						}

						rc.t[bd.b(31, da.eb++)] = i;
						gf.F = -1;
						return true;
					}

					if (var0) {
						return false;
					}

					ob playerName;
					if (gf.F == 120) {
						playerName = pg.packetBuffer.t(-19405);
						var3 = pg.packetBuffer.j(18280);
						var25 = tc.b(var3, -74);
						if (!playerName.a((byte) 28, var25.ob_lb)) {
							var25.ob_lb = playerName;
							dg.a(var25, -86);
						}

						gf.F = -1;
						return true;
					}

					if (gf.F == 81) {
						ie.a(pg.packetBuffer, (byte) -101);
						gf.F = -1;
						return true;
					}

					if (gf.F == 184) {
						client.aBoolean_db = true;
						vb.N = pg.packetBuffer.readUnsignedByte(255);
						qg.m = pg.packetBuffer.readUnsignedByte(255);
						qc.E = pg.packetBuffer.readShort(35);
						me.b = pg.packetBuffer.readUnsignedByte(255);
						fi.d = pg.packetBuffer.readUnsignedByte(255);
						if (fi.d >= 100) {
							var22 = vb.N * 128 + 64;
							var3 = 64 + 128 * qg.m;
							var4 = ug.a(gf.G, var22, (byte) 40, var3) + -qc.E;
							var24 = var22 + -ri.b;
							var35 = -tb.b + var4;
							var34 = -se.d + var3;
							var41 = (int) Math.sqrt((double) (var24 * var24 + var34 * var34));
							bh.l = 2047 & (int) (325.949D * Math.atan2((double) var35, (double) var41));
							rf.x = (int) (-325.949D * Math.atan2((double) var24, (double) var34)) & 2047;
							if (bh.l < 128) {
								bh.l = 128;
							}

							if (bh.l > 383) {
								bh.l = 383;
							}
						}

						gf.F = -1;
						return true;
					}

					if (gf.F == 231) {
						var47 = pg.packetBuffer.readLong(516491232);
						var59 = nh.a(s.a(pg.packetBuffer, true).h((byte) -43));
						nb.a(6, (byte) -109, ug.a(var47, 0).a(83), var59);
						gf.F = -1;
						return true;
					}

					if (gf.F == 245) {
						client.aBoolean_db = false;
						var22 = 0;
						while (var22 < 5) {
							ta.R[var22] = false;
							++var22;
						}

						gf.F = -1;
						return true;
					}

					if (gf.F == 92) {
						gf.F = -1;
						wg.db = 0;
						return true;
					}

					if (gf.F == 125) {
						int i = pg.packetBuffer.readInt(1029109968);
						re var62 = (re) rd.J.a((long) i, 22346);
						if (var62 != null) {
							ba.a(var62, 1, true);
						}

						if (sb.Z != null) {
							dg.a(sb.Z, -100);
							sb.Z = null;
						}

						gf.F = -1;
						return true;
					}

					ra var28;
					if (gf.F == 216) {
						var22 = pg.packetBuffer.readUnsignedShort((byte) -126);
						var3 = pg.packetBuffer.p(-1234576288);
						var4 = pg.packetBuffer.readUnsignedLEShortA((byte) 110);
						var28 = tc.b(var3, -116);
						var28.Lb = (var22 << 16) + var4;
						gf.F = -1;
						return true;
					}

					ob var7;
					if (gf.F == 178) {
						var47 = pg.packetBuffer.readLong(516491232);
						int playerStatus = pg.packetBuffer.readShort(56);
						var24 = pg.packetBuffer.readUnsignedByte(255);
						ob var58 = lb.T;
						if (playerStatus > 0) {
							var58 = pg.packetBuffer.t(-19405);
						}

						ob otherPlayerName = ug.a(var47, 0).a(61);
						var41 = 0;
						if (var41 < ii.o) {
							do {
								if (nb.hc[var41] == var47) {
									if (~playerStatus != ~kd.W[var41]) {
										kd.W[var41] = playerStatus;
										if (playerStatus > 0) {
											nb.a(5, (byte) -117, lb.T, wc.a(new ob[] {otherPlayerName, uc.hasLoggedIn2}, -3));
										} else if (playerStatus == 0) {
											nb.a(5, (byte) -97, lb.T, wc.a(new ob[] {otherPlayerName, qa.hasLoggedOut2}, -3));
										}
									}

									cd.n[var41] = var58;
									ud.gc[var41] = var24;
									otherPlayerName = null;
									break;
								}

								++var41;
							} while (var41 < ii.o);
						}

						if (otherPlayerName != null && ii.o < 200) {
							nb.hc[ii.o] = var47;
							si.V[ii.o] = otherPlayerName;
							kd.W[ii.o] = playerStatus;
							cd.n[ii.o] = var58;
							ud.gc[ii.o] = var24;
							++ii.o;
						}

						var10 = ii.o;
						a.k = re.D;
						var43 = false;
						if (var10 > 0) {
							do {
								--var10;
								var43 = true;
								var45 = 0;
								if (~var45 > ~var10) {
									do {
										if (rd.P == kd.W[var45] || ~kd.W[1 + var45] != ~rd.P) {
											if (kd.W[var45] != 0) {
												++var45;
												continue;
											}

											if (kd.W[var45 + 1] == 0) {
												++var45;
												continue;
											}
										}

										var43 = false;
										var12 = kd.W[var45];
										kd.W[var45] = kd.W[1 + var45];
										kd.W[1 + var45] = var12;
										var52 = cd.n[var45];
										cd.n[var45] = cd.n[var45 + 1];
										cd.n[1 + var45] = var52;
										ob var54 = si.V[var45];
										si.V[var45] = si.V[var45 - -1];
										si.V[1 + var45] = var54;
										long var57 = nb.hc[var45];
										nb.hc[var45] = nb.hc[var45 - -1];
										nb.hc[var45 + 1] = var57;
										int var17 = ud.gc[var45];
										ud.gc[var45] = ud.gc[1 + var45];
										ud.gc[1 + var45] = var17;
										++var45;
									} while (~var45 > ~var10);
								}
							} while ((!var43) && var10 > 0);
						}

						gf.F = -1;
						return true;
					}

					if (gf.F == 121) {
						pa.d = pg.packetBuffer.f(-711444088);
						le.bb = pg.packetBuffer.readUnsignedByte(255);
						var22 = le.bb;
						gf var61;
						if (var22 >= le.bb + 8) {
							var61 = (gf) vg.X.a((byte) -9);
							if (var61 == null) {
								gf.F = -1;
								return true;
							}

							do {
								if (var61.E >= le.bb && ~var61.E > ~(8 + le.bb) && ~pa.d >= ~var61.J && var61.J < 8 + pa.d && gf.G == var61.v) {
									var61.K = 0;
								}

								var61 = (gf) vg.X.b((byte) 123);
							} while (var61 != null);

							gf.F = -1;
							return true;
						}

						var3 = pa.d;
						while (true) {
							for (; pa.d - -8 > var3; ++var3) {
								if (hf.C[gf.G][var22][var3] != null) {
									hf.C[gf.G][var22][var3] = null;
									ta.c(0, var3, var22);
								}
							}

							++var22;
							if (var22 >= le.bb + 8) {
								var61 = (gf) vg.X.a((byte) -9);
								if (var61 == null) {
									gf.F = -1;
									return true;
								}

								do {
									if (var61.E >= le.bb && ~var61.E > ~(8 + le.bb) && ~pa.d >= ~var61.J && var61.J < 8 + pa.d && gf.G == var61.v) {
										var61.K = 0;
									}

									var61 = (gf) vg.X.b((byte) 123);
								} while (var61 != null);

								gf.F = -1;
								return true;
							}

							var3 = pa.d;
						}
					}

					if (gf.F == 164) {
						var22 = pg.packetBuffer.readInt(1029109968);
						var3 = pg.packetBuffer.readInt_V1((byte) -70);
						var4 = pg.packetBuffer.readUnsignedShortA((byte) 120);
						var24 = pg.packetBuffer.readUnsignedShortA((byte) -112);
						if (~var4 == -65536) {
							var4 = -1;
						}

						if (~var24 == -65536) {
							var24 = -1;
						}

						var35 = var4;
						if (var4 > var24) {
							gf.F = -1;
							return true;
						}

						do {
							long scriptId = ((long) var3 << 32) + (long) var35;
							vd var42 = tf.e.a(scriptId, 22346);
							if (var42 != null) {
								var42.c(128);
							}

							tf.e.a(new la(var22), scriptId, !var0);
							++var35;
						} while (var35 <= var24);

						gf.F = -1;
						return true;
					}

					if (gf.F == 74) {
						var22 = pg.packetBuffer.g((byte) 126);
						var3 = pg.packetBuffer.j(18280);
						var4 = pg.packetBuffer.readSignedShort((byte) -67);
						var28 = tc.b(var3, -62);
						var34 = var28.Jc - -var4;
						var35 = var28.anInt_bc - -var22;
						if (~var28.Nb != ~var35 || var34 != var28.gc) {
							var28.Nb = var35;
							var28.gc = var34;
							dg.a(var28, -84);
						}

						gf.F = -1;
						return true;
					}

					if (gf.F == 225) {
						var22 = pg.packetBuffer.f(-711444088);
						var3 = pg.packetBuffer.readUnsignedByteS(-8544);
						var4 = pg.packetBuffer.readUnsignedByteS(-8544);
						gf.G = var3 >> 1;
						le.T.a(var4, var22, -1, (var3 & 1) == 1);
						gf.F = -1;
						return true;
					}

					boolean var29;
					if (gf.F == 134) {
						label1861:
						{
							playerName = pg.packetBuffer.t(-19405);
							ob otherPlayerName;
							if (playerName.a(nf.tradeRequest, false)) {
								var29 = false;
								otherPlayerName = playerName.a(playerName.b(d.G, (byte) 126), 0, (byte) 97);
								var40 = otherPlayerName.e(19790);
								var34 = 0;
								if (jg.s > var34) {
									do {
										if (~pe.db[var34] == ~var40) {
											var29 = true;
											break;
										}

										++var34;
									} while (jg.s > var34);
								}

								if (var29 || ~bh.c != -1) {
									break label1861;
								}

								nb.a(4, (byte) -123, otherPlayerName, wf.wishesToTradeWithYou2);
							} else if (!playerName.a(ni.challengeRequest, false)) {
								if (!playerName.a(hb.assistRequest, false)) {
									if (playerName.a(jh.clan, false)) {
										otherPlayerName = playerName.a(playerName.b(jh.clan, (byte) 125), 0, (byte) 9);
										nb.a(11, (byte) -126, lb.T, otherPlayerName);
									} else if (playerName.a(de.trade, false)) {
										otherPlayerName = playerName.a(playerName.b(de.trade, (byte) 120), 0, (byte) 77);
										if (~bh.c != -1) {
											break label1861;
										}

										nb.a(12, (byte) -110, lb.T, otherPlayerName);
									} else if (!playerName.a(de.assist, false)) {
										if (!playerName.a(e.duelStake, false)) {
											if (!playerName.a(de.duelFriendly, false)) {
												if (!playerName.a(m.clanRequest, false)) {
													nb.a(0, (byte) -107, lb.T, playerName);
												} else {
													otherPlayerName = playerName.a(playerName.b(d.G, (byte) 121), 0, (byte) 39);
													var29 = false;
													var40 = otherPlayerName.e(19790);
													var34 = 0;
													if (jg.s > var34) {
														do {
															if (pe.db[var34] == var40) {
																var29 = true;
																if (dummy == 0) {
																	break;
																}
															}

															++var34;
														} while (jg.s > var34);
													}

													if (var29 || bh.c != 0) {
														break label1861;
													}

													nb.a(16, (byte) -128, otherPlayerName, lb.T);
												}
											} else {
												var29 = false;
												otherPlayerName = playerName.a(playerName.b(d.G, (byte) 119), 0, (byte) 126);
												var40 = otherPlayerName.e(19790);
												var34 = 0;
												if (var34 < jg.s) {
													do {
														if (~var40 == ~pe.db[var34]) {
															var29 = true;
															if (dummy == 0) {
																break;
															}
														}

														++var34;
													} while (var34 < jg.s);
												}

												if (var29 || ~bh.c != -1) {
													break label1861;
												}

												nb.a(15, (byte) -95, otherPlayerName, lb.T);
											}
										} else {
											otherPlayerName = playerName.a(playerName.b(d.G, (byte) 127), 0, (byte) 30);
											var40 = otherPlayerName.e(19790);
											var29 = false;
											var34 = 0;
											if (~var34 > ~jg.s) {
												do {
													if (var40 == pe.db[var34]) {
														var29 = true;
														if (dummy == 0) {
															break;
														}
													}

													++var34;
												} while (~var34 > ~jg.s);
											}

											if (var29 || ~bh.c != -1) {
												break label1861;
											}

											nb.a(14, (byte) -122, otherPlayerName, lb.T);
										}
									} else {
										otherPlayerName = playerName.a(playerName.b(de.assist, (byte) 125), 0, (byte) 22);
										if (~bh.c != -1) {
											break label1861;
										}

										nb.a(13, (byte) -128, lb.T, otherPlayerName);
									}
								} else {
									otherPlayerName = playerName.a(playerName.b(d.G, (byte) 119), 0, (byte) 91);
									var40 = otherPlayerName.e(19790);
									var29 = false;
									var34 = 0;
									if (jg.s > var34) {
										do {
											if (var40 == pe.db[var34]) {
												var29 = true;
												if (dummy == 0) {
													break;
												}
											}

											++var34;
										} while (jg.s > var34);
									}

									if (var29 || ~bh.c != -1) {
										break label1861;
									}

									nb.a(10, (byte) -101, otherPlayerName, lb.T);
								}
							} else {
								otherPlayerName = playerName.a(playerName.b(d.G, (byte) 119), 0, (byte) 21);
								var29 = false;
								var40 = otherPlayerName.e(19790);
								var34 = 0;
								if (var34 < jg.s) {
									do {
										if (var40 == pe.db[var34]) {
											var29 = true;
											if (dummy == 0) {
												break;
											}
										}

										++var34;
									} while (var34 < jg.s);
								}

								if (!var29 && bh.c == 0) {
									ob var39 = playerName.a(-9 + playerName.a(false), playerName.b(d.G, (byte) 125) + 1, (byte) 33);
									nb.a(8, (byte) -100, otherPlayerName, var39);
								}
							}
						}

						gf.F = -1;
						return true;
					}

					if (gf.F == 42) {
						var22 = pg.packetBuffer.readSignedLEShort(109);
						var3 = pg.packetBuffer.p(-1234576288);
						var25 = tc.b(var3, -58);
						if (var25.nc != var22 || var22 == -1) {
							var25.Oc = 0;
							var25.nc = var22;
							var25.Fb = 0;
							dg.a(var25, -82);
						}

						gf.F = -1;
						return true;
					}

					if (gf.F == 146) {
						var22 = pg.packetBuffer.readShort(83);
						var3 = pg.packetBuffer.p(-1234576288);
						var4 = (32627 & var22) >> 10;
						var24 = (var22 & 1023) >> 5;
						ra var37 = tc.b(var3, -104);
						var35 = 31 & var22;
						var34 = (var35 << 3) + (var24 << 11) + (var4 << 19);
						if (var37.N != var34) {
							var37.N = var34;
							dg.a(var37, -108);
						}

						gf.F = -1;
						return true;
					}

					if (gf.F == 34) {
						na.c((byte) 98);
						l.d = pg.packetBuffer.readUnsignedByte(255);
						gf.F = -1;
						ja.z = re.D;
						return true;
					}

					if (gf.F == 109) {
						var22 = 0;
						if (~sa.c.length >= ~var22) {
							gf.F = -1;
							return true;
						}

						do {
							if (~ji.K[var22] != ~sa.c[var22]) {
								sa.c[var22] = ji.K[var22];
								gi.a((byte) -77, var22);
								rc.t[bd.b(da.eb++, 31)] = var22;
							}

							++var22;
						} while (~sa.c.length < ~var22);

						gf.F = -1;
						return true;
					}

					if (gf.F == 162) {
						client.aBoolean_db = true;
						ca.Fb = pg.packetBuffer.readUnsignedByte(255);
						hf.anInt_g = pg.packetBuffer.readUnsignedByte(255);
						sb.gb = pg.packetBuffer.readShort(91);
						ke.pb = pg.packetBuffer.readUnsignedByte(255);
						ja.r = pg.packetBuffer.readUnsignedByte(255);
						if (ja.r >= 100) {
							se.d = 64 + hf.anInt_g * 128;
							ri.b = 64 + ca.Fb * 128;
							tb.b = ug.a(gf.G, ri.b, (byte) 40, se.d) + -sb.gb;
						}

						gf.F = -1;
						return true;
					}

					if (gf.F == 72) {
						var22 = pg.packetBuffer.readShort(69);
						bi.a((byte) 120, var22);
						ff.eb[bd.b(sf.h++, 31)] = bd.b(var22, 32767);
						gf.F = -1;
						return true;
					}

					if (gf.F == 78) {
						if (~bg.h != 0) {
							vg.a(0, true, bg.h);
						}

						gf.F = -1;
						return true;
					}

					if (gf.F == 236) {
						var22 = pg.packetBuffer.readShort(111);
						if (~var22 == -65536) {
							var22 = -1;
						}

						var3 = pg.packetBuffer.p(-1234576288);
						var25 = tc.b(var3, -95);
						if (var25.bb != 2 || var22 != var25.nb) {
							var25.bb = 2;
							var25.nb = var22;
							dg.a(var25, -122);
						}

						gf.F = -1;
						return true;
					}

					if (gf.F == 38) {
						var22 = pg.packetBuffer.readUnsignedShortA((byte) -99);
						var3 = pg.packetBuffer.j(18280);
						var4 = pg.packetBuffer.readUnsignedShortA((byte) -26);
						var24 = pg.packetBuffer.readUnsignedShortA((byte) -117);
						ra var38 = tc.b(var3, -84);
						if (~var38.k != ~var24 || ~var38.S != ~var22 || var38.C != var4) {
							var38.S = var22;
							var38.C = var4;
							var38.k = var24;
							dg.a(var38, -126);
						}

						gf.F = -1;
						return true;
					}

					if (gf.F == 39) {
						var22 = pg.packetBuffer.readUnsignedShortA((byte) 98);
						if (var22 == '\uffff') {
							var22 = -1;
						}

						tc.b(var22, (byte) 114);
						gf.F = -1;
						return true;
					}

					if (gf.F == 219) {
						var22 = pg.packetBuffer.readUnsignedShortA((byte) -65);
						if (var22 == '\uffff') {
							var22 = -1;
						}

						var3 = pg.packetBuffer.readUnsignedMedInt(60);
						nf.d(123, var3, var22);
						gf.F = -1;
						return true;
					}

					if (gf.F == 199) {
						se.e = pg.packetBuffer.readUnsignedByte(255);
						gf.F = -1;
						return true;
					}

					if (gf.F == 51) {
						ig.i = pg.packetBuffer.t(-19405);
						dc.a((byte) 103, ig.i);
						gf.F = -1;
						return true;
					}

					if (gf.F == 148) {
						var22 = pg.packetBuffer.readUnsignedByte(255);
						var3 = pg.packetBuffer.readUnsignedByte(255);
						var4 = pg.packetBuffer.readUnsignedByte(255);
						var24 = pg.packetBuffer.readUnsignedByte(255);
						var35 = pg.packetBuffer.readShort(72);
						ta.R[var22] = true;
						s.db[var22] = var3;
						o.b[var22] = var4;
						ci.B[var22] = var24;
						qi.q[var22] = var35;
						gf.F = -1;
						return true;
					}

					if (gf.F == 108) {
						ch.bb = pg.packetBuffer.readUnsignedByte(255);
						a.k = re.D;
						gf.F = -1;
						return true;
					}

					if (~gf.F == -128) {
						na.c((byte) 127);
						ra.I = pg.packetBuffer.readSignedShort((byte) -67);
						gf.F = -1;
						ja.z = re.D;
						return true;
					}

					if (gf.F == 135) {
						id.a(pg.packetBuffer, sh.packetSize, 6358, gi.y);
						gf.F = -1;
						return true;
					}

					if (gf.F == 234) {
						kg.a = pg.packetBuffer.readShort(68) * 30;
						gf.F = -1;
						ja.z = re.D;
						return true;
					}

					if (gf.F == 14) {
						var22 = pg.packetBuffer.readInt(1029109968);
						var3 = pg.packetBuffer.readShort(53);
						if (var22 < -70000) {
							var3 += '耀';
						}

						label1046:
						{
							if (~var22 > -1) {
								var25 = null;
								if (dummy == 0) {
									if (pg.packetBuffer.pointer >= sh.packetSize) {
										if (var25 != null) {
											dg.a(var25, -102);
										}

										na.c((byte) 125);
										ff.eb[bd.b(sf.h++, (int) 31)] = bd.b(32767, (int) var3);
										gf.F = -1;
										return true;
									}
									break label1046;
								}
							}

							var25 = tc.b(var22, (int) -61);
							if (dummy == 0 && pg.packetBuffer.pointer >= sh.packetSize) {
								if (var25 != null) {
									dg.a(var25, -102);
								}

								na.c((byte) 125);
								ff.eb[bd.b(sf.h++, (int) 31)] = bd.b(32767, (int) var3);
								gf.F = -1;
								return true;
							}
						}

						do {
							var24 = pg.packetBuffer.r(-2);
							var35 = pg.packetBuffer.readShort(47);
							var34 = 0;
							if (~var35 != -1) {
								var34 = pg.packetBuffer.readUnsignedByte(255);
								if (~var34 == -256) {
									var34 = pg.packetBuffer.readInt(1029109968);
								}
							}

							if (var25 != null && ~var24 <= -1 && var25.ints_tc.length > var24) {
								var25.ints_tc[var24] = var35;
								var25.fb[var24] = var34;
							}

							wb.a(var24, -1 + var35, var3, -20971, var34);
						} while (pg.packetBuffer.pointer < sh.packetSize);

						if (var25 != null) {
							dg.a(var25, -102);
						}

						na.c((byte) 125);
						ff.eb[bd.b(sf.h++, (int) 31)] = bd.b(32767, (int) var3);
						gf.F = -1;
						return true;
					}

					if (~gf.F == -47) {
						long clientScriptId = pg.packetBuffer.readLong(516491232);
						var4 = pg.packetBuffer.readShort(53);
						byte var33 = pg.packetBuffer.readByte(1064893128);
						var29 = false;
						if (~(clientScriptId & Long.MIN_VALUE) != -1L) {
							var29 = true;
						}

						label1879:
						{
							if (!var29) {
								var7 = pg.packetBuffer.t(-19405);
								vf var36 = new vf();
								var36.clientScriptId = clientScriptId;
								var36.o = ug.a(var36.clientScriptId, 0);
								var36.aByte_s = var33;
								var36.A = var4;
								var36.y = var7;
								var9 = oc.d - 1;
								if (var9 >= 0) {
									do {
										var10 = sa.f[var9].o.c(var36.o, (byte) -123);
										if (~var10 == -1) {
											sa.f[var9].A = var4;
											sa.f[var9].aByte_s = var33;
											sa.f[var9].y = var7;
											if (clientScriptId == r.X) {
												lh.U = var33;
											}

											kg.i = re.D;
											gf.F = -1;
											return true;
										} else {

											if (var10 < 0) {
												break;
											}
										}

										--var9;
									} while (var9 >= 0);
								}

								if (oc.d >= sa.f.length) {
									gf.F = -1;
									return true;
								}

								var10 = -1 + oc.d;
								if (dummy != 0 || ~var9 > ~var10) {
									do {
										sa.f[1 + var10] = sa.f[var10];
										--var10;
									} while (~var9 > ~var10);
								}

								if (~oc.d == -1) {
									sa.f = new vf[100];
								}

								sa.f[1 + var9] = var36;
								++oc.d;
								if (r.X != clientScriptId) {
									break label1879;
								}

								lh.U = var33;
								if (dummy == 0) {
									break label1879;
								}
							}

							if (oc.d == 0) {
								gf.F = -1;
								return true;
							}

							boolean var32 = false;
							clientScriptId &= Long.MAX_VALUE;
							var34 = 0;
							if (dummy != 0 || ~var34 > ~oc.d) {
								while (~sa.f[var34].clientScriptId != ~clientScriptId || var4 != sa.f[var34].A || dummy != 0) {
									++var34;
									if (~var34 <= ~oc.d) {
										break;
									}
								}
							}

							if (oc.d > var34) {
								while (true) {
									if (~(oc.d - 1) >= ~var34) {
										--oc.d;
										sa.f[oc.d] = null;
										break;
									} else {
										sa.f[var34] = sa.f[var34 + 1];
									}
									++var34;
								}
							}
						}

						gf.F = -1;
						kg.i = re.D;
						return true;
					}

					if (gf.F == 18) {
						System.out.println("Packet 18");
						fi.a(true, (byte) -65);
						gf.F = -1;
						return true;
					}

					if (gf.F == 153) {
						var47 = pg.packetBuffer.readLong(516491232);
						pg.packetBuffer.readByte(1064893128);
						var40 = pg.packetBuffer.readLong(516491232);
						var27 = (long) pg.packetBuffer.readShort(90);
						long var8 = (long) pg.packetBuffer.readUnsignedMedInt(107);
						var10 = pg.packetBuffer.readUnsignedByte(255);
						var11 = var8 + (var27 << 32);
						boolean var13 = false;
						int var14 = 0;
						if (dummy != 0 || ~var14 > -101) {
							do {
								if (~ff.fb[var14] == ~var11) {
									var13 = true;
									if (dummy == 0) {
										break;
									}
								}

								++var14;
							} while (~var14 > -101);
						}

						if (var10 <= 1) {
							int var15 = 0;
							if (dummy != 0 || ~var15 > ~jg.s) {
								do {
									if (~var47 == ~pe.db[var15]) {
										var13 = true;
										if (dummy == 0) {
											break;
										}
									}

									++var15;
								} while (~var15 > ~jg.s);
							}
						}

						if (!var13 && ~bh.c == -1) {
							label1844:
							{
								ff.fb[wh.i] = var11;
								wh.i = (wh.i - -1) % 100;
								ob var55 = nh.a(s.a(pg.packetBuffer, !var0).h((byte) -43));
								if (var10 != 2 && ~var10 != -4) {
									if (var10 == 1) {
										mf.a(-11840, wc.a(new ob[] {v.cb, ug.a(var47, 0).a((int) 27)}, -3), ug.a(var40, 0).a((int) 21), var55, 9);
										if (dummy == 0) {
											break label1844;
										}
									}

									mf.a(-11840, ug.a(var47, 0).a((int) 103), ug.a(var40, 0).a((int) 116), var55, 9);
									if (dummy == 0) {
										break label1844;
									}
								}

								mf.a(-11840, wc.a(new ob[] {ib.d, ug.a(var47, 0).a((int) 16)}, -3), ug.a(var40, 0).a((int) 47), var55, 9);
							}
						}

						gf.F = -1;
						return true;
					}

					ra var23;
					if (gf.F == 90) {
						var22 = pg.packetBuffer.j(18280);
						var23 = tc.b(var22, (int) -47);
						var23.bb = 3;
						var23.nb = le.T.Ac.b(24295);
						dg.a(var23, -114);
						gf.F = -1;
						return true;
					}

					if (~gf.F == -92) {
						playerName = pg.packetBuffer.t(-19405);
						Object[] var30 = new Object[playerName.a(false) - -1];
						var4 = playerName.a(false) - 1;
						wc var31;
						if (dummy == 0 && ~var4 > -1) {
							var30[0] = pg.packetBuffer.readInt(1029109968);
							var31 = new wc();
							var31.P = var30;
							wg.a(-118, (wc) var31);
							gf.F = -1;
							return true;
						}

						do {
							if (playerName.a((int) 126, (int) var4) != 115) {
								var30[1 + var4] = pg.packetBuffer.readInt(1029109968);
								if (dummy != 0) {
									var30[var4 + 1] = pg.packetBuffer.t(-19405);
									--var4;
								} else {
									--var4;
								}
							} else {
								var30[var4 + 1] = pg.packetBuffer.t(-19405);
								--var4;
							}
						} while (~var4 <= -1);

						var30[0] = pg.packetBuffer.readInt(1029109968);
						var31 = new wc();
						var31.P = var30;
						wg.a(-118, (wc) var31);
						gf.F = -1;
						return true;
					}

					if (~gf.F == -5) {
						var22 = pg.packetBuffer.readShort(118);
						var3 = pg.packetBuffer.readInt(1029109968);
						if (var22 == '\uffff') {
							var22 = -1;
						}

						label1816:
						{
							var4 = pg.packetBuffer.readInt_V1((byte) -70);
							var28 = tc.b(var4, (int) -124);
							ei var6;
							if (!var28.R) {
								if (~var22 == 0) {
									var28.bb = 0;
									gf.F = -1;
									return true;
								}

								var6 = jg.a((byte) -61, var22);
								var28.bb = 4;
								var28.C = 100 * var6.L / var3;
								var28.k = var6.wb;
								var28.S = var6.lb;
								var28.nb = var22;
								dg.a(var28, -114);
								if (dummy == 0) {
									break label1816;
								}
							}

							var28.Kc = var3;
							var28.Tb = var22;
							var6 = jg.a((byte) -61, var22);
							var28.S = var6.lb;
							var28.Nc = var6.N;
							var28.pc = var6.yb;
							var28.jb = var6.tb;
							var28.C = var6.L;
							if (~var28.L < -1) {
								var28.C = var28.C * 32 / var28.L;
							}

							var28.k = var6.wb;
							dg.a(var28, -83);
						}

						gf.F = -1;
						return true;
					}

					if (gf.F == 221 || gf.F == 240 || ~gf.F == -143 || ~gf.F == -86 || ~gf.F == -184 || ~gf.F == -150 || gf.F == 172 || gf.F == 52 || ~gf.F == -49 || ~gf.F == -233 || gf.F == 247) {
						dh.a((int) 2);
						gf.F = -1;
						return true;
					}

					if (gf.F == 66) {
						da.b((byte) 122);
						gf.F = -1;
						return false;
					}

					if (gf.F == 99) { //NPC UPDATE
						System.err.println("Packet 99");
						bg.a(var0);
						gf.F = -1;
						return true;
					}

					if (~gf.F == -101) {
						var22 = 0;
						if (dummy == 0 && var22 >= wd.j) {
							na.c((byte) 98);
							gf.F = -1;
							da.eb += 32;
							return true;
						}

						do {
							rd var26 = qd.a(var0, var22);
							if (var26 != null && ~var26.H == -1) {
								ji.K[var22] = 0;
								sa.c[var22] = 0;
							}

							++var22;
						} while (var22 < wd.j);

						na.c((byte) 98);
						gf.F = -1;
						da.eb += 32;
						return true;
					}

					if (gf.F == 128) {
						var22 = pg.packetBuffer.readInt(1029109968);
						d.S = gi.y.a(var22, (byte) 102);
						gf.F = -1;
						return true;
					}

					if (gf.F == 122) {
						pa.d = pg.packetBuffer.readUByteC((byte) -127);
						le.bb = pg.packetBuffer.readUnsignedByteS(-8544);
						if (dummy != 0) {
							gf.F = pg.packetBuffer.readUnsignedByte(255);
							dh.a((int) 2);
						}

						while (~pg.packetBuffer.pointer > ~sh.packetSize) {
							gf.F = pg.packetBuffer.readUnsignedByte(255);
							dh.a((int) 2);
						}

						gf.F = -1;
						return true;
					}

					if (~gf.F == -234) {
						var22 = pg.packetBuffer.readUnsignedShort((byte) -119);
						var3 = pg.packetBuffer.readInt_V1((byte) -70);
						var25 = tc.b(var3, (int) -103);
						if (var25 != null && ~var25.Ac == -1) {
							if (~var22 < ~(-var25.w + var25.anInt_cb)) {
								var22 = var25.anInt_cb + -var25.w;
							}

							if (~var22 > -1) {
								var22 = 0;
							}

							if (~var22 != ~var25.rc) {
								var25.rc = var22;
								dg.a(var25, -119);
							}
						}

						gf.F = -1;
						return true;
					}

					if (~gf.F == -177) {
						na.c((byte) 107);
						var22 = pg.packetBuffer.readUByteC((byte) -127);
						var3 = pg.packetBuffer.j(18280);
						var4 = pg.packetBuffer.readUByteC((byte) -127);
						dg.Dc[var4] = var3;
						de.r[var4] = var22;
						gh.mb[var4] = 1;
						var24 = 0;
						if (dummy != 0) {
							if (var3 >= ed.ints_e[var24]) {
								gh.mb[var4] = var24 + 2;
							}

							++var24;
						}

						for (; var24 < 98; ++var24) {
							if (var3 >= ed.ints_e[var24]) {
								gh.mb[var4] = var24 + 2;
							}
						}

						la.B[bd.b(fh.a++, (int) 31)] = var4;
						gf.F = -1;
						return true;
					}

					if (gf.F == 166) {
						System.out.println("Packet 166");
						fi.a(false, (byte) -104);
						gf.F = -1;
						return true;
					}

					if (~gf.F == -102) {
						var22 = pg.packetBuffer.readShort(49);
						if (var22 == '\uffff') {
							var22 = -1;
						}

						var3 = pg.packetBuffer.readUnsignedByte(255);
						var4 = pg.packetBuffer.readShort(55);
						ih.a(var3, var22, 0, var4);
						gf.F = -1;
						return true;
					}

					if (gf.F == 159) {
						label838:
						{
							var22 = pg.packetBuffer.readUnsignedByte(255);
							if (~pg.packetBuffer.readUnsignedByte(255) != -1) {
								--pg.packetBuffer.pointer;
								kg.d[var22] = new jg(pg.packetBuffer);
								if (dummy == 0) {
									break label838;
								}
							}

							kg.d[var22] = new jg();
						}

						h.lb = re.D;
						gf.F = -1;
						return true;
					}

					if (gf.F == 44) {
						af.h(0);
						gf.F = -1;
						return true;
					}

					if (gf.F == 175) {
						int i = pg.packetBuffer.f(-711444088);
						int id = pg.packetBuffer.readInt_V1((byte) -70);
						int i2 = pg.packetBuffer.readUnsignedLEShortA((byte) 110);
						re re = (re) rd.J.a((long) id, 22346);
						if (re != null) {
							ba.a(re, 1, i2 != re.w);
						}

						ra.a(i, 100, id, i2);
						gf.F = -1;
						return true;
					}

					if (~gf.F == -221) {
						var22 = pg.packetBuffer.readShort(56);
						if (var22 == '\uffff') {
							var22 = -1;
						}

						var3 = pg.packetBuffer.j(18280);
						var25 = tc.b(var3, (int) -85);
						if (~var25.bb != -2 || var22 != var25.nb) {
							var25.nb = var22;
							var25.bb = 1;
							dg.a(var25, -108);
						}

						gf.F = -1;
						return true;
					}

					if (gf.F == 118) {
						var22 = pg.packetBuffer.readInt_V1((byte) -70);
						var3 = pg.packetBuffer.readUnsignedShortA((byte) 107);
						ji.K[var3] = var22;
						if (~sa.c[var3] != ~var22) {
							sa.c[var3] = var22;
							gi.a((byte) -115, var3);
						}

						rc.t[bd.b(31, (int) (da.eb++))] = var3;
						gf.F = -1;
						return true;
					}

					if (~gf.F == -187) {
						var22 = pg.packetBuffer.p(-1234576288);
						var23 = tc.b(var22, (int) -51);
						var4 = 0;
						if (dummy != 0) {
							var23.ints_tc[var4] = -1;
							var23.ints_tc[var4] = 0;
							++var4;
						}

						while (~var23.ints_tc.length < ~var4) {
							var23.ints_tc[var4] = -1;
							var23.ints_tc[var4] = 0;
							++var4;
						}

						dg.a(var23, -87);
						gf.F = -1;
						return true;
					}

					if (gf.F == 124) {
						var22 = pg.packetBuffer.readUnsignedShortA((byte) -114);
						var3 = pg.packetBuffer.readUnsignedShortA((byte) -96);
						rf.x = var22;
						gf.F = -1;
						bh.l = var3;
						return true;
					}

					ra.a("T1 - " + gf.F + "," + ff.ab + "," + tg.q + " - " + sh.packetSize, (Throwable) null, (byte) -112);
					da.b((byte) 113);
				} catch (IOException var19) {
					ac.dropClient(25005);
				} catch (Exception var20) {
					String var2 = "T2 - " + gf.F + "," + ff.ab + "," + tg.q + " - " + sh.packetSize + "," + (le.T.regionLocalX[0] + entityXPosition) + "," + (le.T.regionLocalY[0] + entityYPosition) + " - ";
					var3 = 0;
					if (dummy != 0 || ~sh.packetSize < ~var3 && var3 < 50) {
						do {
							var2 = var2 + pg.packetBuffer.buffer[var3] + ",";
							++var3;
						} while (~sh.packetSize < ~var3 && var3 < 50);
					}

					ra.a(var2, var20, (byte) -99);
					da.b((byte) -39);
				}

				return true;
			}
		} catch (RuntimeException var21) {
			throw bc.a(var21, "ic.B(" + var0 + ')');
		}
	}

	public static void b (byte var0) {
		try {
			Y = null;
			runescapeIsLoadingPleaseWait = null;
			L = null;
			Z = null;
			I = null;
			runescapeIsLoadingPleaseWait2 = null;
			ab = null;
			D = null;
			V = null;
			int var1 = -28 / ((var0 - 83) / 42);
			R = null;
			cb = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "ic.A(" + var0 + ')');
		}
	}

	final int a (byte var1, int var2) {
		try {
			++bb;
			if (this.W == null) {
				return this.S;
			} else {
				if (var1 < 30) {
					b((byte) 7);
				}

				la var3 = (la) this.W.a((long) var2, 22346);
				return var3 == null ? this.S : var3.q;
			}
		} catch (RuntimeException var4) {
			throw bc.a(var4, "ic.E(" + var1 + ',' + var2 + ')');
		}
	}

	public ic () {
		this.T = ag.ob_o;
	}

	static {
		D = L;
		runescapeIsLoadingPleaseWait = rf.a(40, "RuneScape is loading )2 please wait)3)3)3");
		V = rf.a(40, "scrollen:");
		Y = rf.a(40, "Mitglieder)2Welt");
		I = rf.a(40, "Texturen geladen)3");
		Z = L;
		runescapeIsLoadingPleaseWait2 = runescapeIsLoadingPleaseWait;
		cb = rf.a(40, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");
	}
}
