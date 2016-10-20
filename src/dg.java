import java.util.Arrays;

final class dg extends ud {
	
	int hc = 0;
	static int ic;
	private short jc = 0;
	static int kc;
	int lc = -1;
	int mc;
	static int nc = 0;
	int oc = 0;
	static short[] pc = new short[] {(short) 6798, (short) 8741, (short) 25238, (short) 4626, (short) 4550};
	int qc = 0;
	fe rc;
	int sc;
	static int tc;
	boolean uc = false;
	static int vc;
	static long wc = 0L;
	private short xc = 0;
	int yc;
	int zc;
	hc Ac;
	int Bc;
	int Cc = 0;
	static int[] Dc = new int[25];
	int Ec = -1;
	static int Fc;
	int Gc;
	static int Hc;
	ob Ic;
	int Jc;
	int Kc = 0;
	
	final boolean b(byte var1) {
		try {
			++Fc;
			return this.Ac == null ? false : var1 >= 67;
		} catch (RuntimeException var3) {
			throw bc.a(var3, "dg.H(" + var1 + ')');
		}
	}
	
	static void a(ra class_ra, int unused) {
		try {
			++tc;
			if (ag.e == class_ra.x) {
				ob.bb[class_ra.vc] = true;
			}
		} catch (RuntimeException var3) {
			throw bc.a(var3, "dg.L(" + (class_ra != null ? "{...}" : "null") + ',' + unused + ')');
		}
	}
	
	public static void e(byte var0) {
		try {
			Dc = null;
			if (var0 < 72) {
				e((byte) 92);
			}
			
			pc = null;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "dg.J(" + var0 + ')');
		}
	}
	
	final int b() {
		try {
			++vc;
			return super.hb;
		} catch (RuntimeException var2) {
			throw bc.a(var2, "dg.C(" + ')');
		}
	}
	
	final void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		int var45 = client.anInt_wb;
		
		try {
			++kc;
			if (this.Ac != null) {
				ce var11 = super.mb != -1 && ~super.wb == -1 ? le.c(15619, super.mb) : null;
				ce var12 = ~super.P == 0 || this.uc || ~super.P == ~super.Jb && var11 != null ? null : le.c(15619, super.P);
				fe var13 = this.Ac.a(true, super.Kb, super.Wb, var12, var11);
				if (var13 != null) {
					int var14 = 0;
					int var15 = 0;
					super.hb = var13.b();
					int var16 = 0;
					if (~this.jc != -1 && ~this.xc != -1) {
						int var17 = ec.W[var1];
						int var18 = ec.L[var1];
						short var19 = this.jc;
						short var20 = this.xc;
						int var21 = -var19 / 2;
						int var22 = -var20 / 2;
						int var24 = -(var21 * var17) + var18 * var22 >> 16;
						int var23 = var17 * var22 - -(var21 * var18) >> 16;
						int var25 = ug.a(gf.G, var23 + super.coordX, (byte) 40, super.coordY + var24);
						int var27 = -var20 / 2;
						int var26 = var19 / 2;
						int var28 = var17 * var27 + var18 * var26 >> 16;
						int var29 = var18 * var27 - var26 * var17 >> 16;
						int var30 = ug.a(gf.G, super.coordX + var28, (byte) 40, var29 + super.coordY);
						int var31 = -var19 / 2;
						int var32 = var20 / 2;
						int var34 = var18 * var32 + -(var17 * var31) >> 16;
						int var33 = var18 * var31 + var17 * var32 >> 16;
						int var35 = ug.a(gf.G, super.coordX + var33, (byte) 40, super.coordY - -var34);
						int var36 = var19 / 2;
						int var37 = var20 / 2;
						int var38 = var18 * var36 + var17 * var37 >> 16;
						int var39 = var18 * var37 + -(var17 * var36) >> 16;
						int var41 = var25 >= var30 ? var30 : var25;
						int var40 = ug.a(gf.G, var38 + super.coordX, (byte) 40, var39 + super.coordY);
						var16 = var40 + var25;
						int var42 = var40 > var35 ? var35 : var40;
						if (~(var35 + var30) > ~var16) {
							var16 = var30 - -var35;
						}
						
						int var43 = ~var30 <= ~var40 ? var40 : var30;
						int var44 = var25 < var35 ? var25 : var35;
						var14 = 2047 & (int) (Math.atan2((double) (-var42 + var41), (double) var20) * 325.95D);
						if (~var14 != -1) {
							var13.g(var14);
						}
						
						var15 = (int) (Math.atan2((double) (-var43 + var44), (double) var19) * 325.95D) & 2047;
						if (var15 != 0) {
							var13.h(var15);
						}
						
						var16 = -super.zb + (var16 >> 1);
						if (var16 != 0) {
							var13.d(0, var16, 0);
						}
					}
					
					fe var47 = null;
					if (!this.uc && ~super.O != 0 && ~super.Sb != 0) {
						kh var48 = lb.d(super.O, -62);
						var47 = var48.b(13557, super.Sb);
						if (var47 != null) {
							var47.d(0, -super.Q, 0);
							if (var48.O) {
								if (~var14 != -1) {
									var47.g(var14);
								}
								
								if (var15 != 0) {
									var47.h(var15);
								}
								
								if (~var16 != -1) {
									var47.d(0, var16, 0);
								}
							}
						}
					}
					
					fe var49 = null;
					if (!this.uc && this.rc != null) {
						if (bi.f >= this.hc) {
							this.rc = null;
						}
						
						if (bi.f >= this.oc && bi.f < this.hc) {
							label166:
							{
								var49 = this.rc;
								var49.d(-super.coordX + this.zc, this.mc + -super.zb, -super.coordY + this.Bc);
								if (super.U == 512) {
									var49.c();
									if (var45 == 0) {
										break label166;
									}
								}
								
								if (~super.U == -1025) {
									var49.e();
									if (var45 == 0) {
										break label166;
									}
								}
								
								if (super.U == 1536) {
									var49.d();
								}
							}
						}
					}
					
					if (var47 != null) {
						var13 = ((he) var13).a(var47);
					}
					
					if (var49 != null) {
						var13 = ((he) var13).a(var49);
					}
					
					var13.O = true;
					var13.a(var1, var2, var3, var4, var5, var6, var7, var8, var9);
					if (var49 != null) {
						label121:
						{
							if (~super.U != -513) {
								if (super.U == 1024) {
									var49.e();
									if (var45 == 0) {
										break label121;
									}
								}
								
								if (~super.U != -1537) {
									break label121;
								}
								
								var49.c();
								if (var45 == 0) {
									break label121;
								}
							}
							
							var49.d();
						}
						
						var49.d(super.coordX - this.zc, -this.mc + super.zb, -this.Bc + super.coordY);
					}
				}
			}
		} catch (RuntimeException var46) {
			throw bc.a(var46, "dg.B(" + var1 + ',' + var2 + ',' + var3 + ',' + var4 + ',' + var5 + ',' + var6 + ',' + var7 + ',' + var8 + ',' + var9 + ')');
		}
	}
	
	final void a(int unused, og class_og) {
		int dummy = client.anInt_wb;
		
		try {
			class_og.pointer = 0;
			++Hc;
			int playerGender = class_og.readUnsignedByte(255);
			System.out.println("playerGender : " + playerGender + " calculate... " + (playerGender & 0x2));
			if ((playerGender & 0x2) == 2) {
				this.jc = (short) (class_og.readUnsignedByte(255) << 2);
				this.xc = (short) (class_og.readUnsignedByte(255) << 2);
			} else {
				this.xc = 0;
				this.jc = 0;
			}
			
			boolean flag = ~(playerGender & 0x4) != -1;
			int[] data = new int[12];
			int i1 = 0x1 & playerGender;
			int i2 = -1;
			super.Gb = 1 + (playerGender >> 3);
			this.Ec = class_og.readByte(1064893128);
			this.lc = class_og.readByte(1064893128);
			System.out.println("Ec : " + this.Ec + " lc : " + this.lc);
			this.Kc = 0;
			int index = 0;
			int i4;
			do {
				int i6 = class_og.readUnsignedByte(255);
				if (i6 == 0) {
					data[index] = 0;
					index++;
				} else {
					
					int i = class_og.readUnsignedByte(255);
					int equipmentItemId = (i6 << 8) + i;
					System.out.println("index : " + index + " i : " + i + " equipmentItemId : " + equipmentItemId + " i6 : " + i6);
					if (index == 0 && equipmentItemId == 65535) {
						i2 = class_og.readShort(93);
						break;
					}
					
					if (equipmentItemId >= 32768) {
						equipmentItemId = kh.Z[equipmentItemId - 32768];
						data[index] = ff.b(1073741824, equipmentItemId);
						int var12 = jg.a((byte) -61, equipmentItemId).Hb;
						if (~var12 != -1) {
							this.Kc = var12;
							++index;
						} else {
							++index;
						}
					} else {
						data[index] = ff.b(Integer.MIN_VALUE, equipmentItemId + -256);
						++index;
					}
				}
				System.err.println("equipmentCountIndex: " + index);
			} while (index < 12);
			
			System.out.println("Equipment: " + Arrays.toString(data));
			
			int[] colourValues = new int[5];
			i4 = 0;
			
			while (~i4 > -6) {
				int colourValue = class_og.readUnsignedByte(unused + 25269);
				if (colourValue >= 0) {
					if (~la.x[i4].length >= ~colourValue) {
						colourValue = 0;
					}
				} else {
					colourValue = 0;
				}
				
				colourValues[i4] = colourValue;
				++i4;
			}
			
			super.Jb = class_og.readShort(99);
			if (super.Jb == '\uffff') {
				super.Jb = -1;
			}
			
			super.Rb = class_og.readShort(82);
			if (~super.Rb == -65536) {
				super.Rb = -1;
			}
			
			super.R = super.Rb;
			super.Y = class_og.readShort(unused ^ -25081);
			if (super.Y == '\uffff') {
				super.Y = -1;
			}
			
			super.ub = class_og.readShort(77);
			if (super.ub == '\uffff') {
				super.ub = -1;
			}
			
			super.vb = class_og.readShort(82);
			if (super.vb == '\uffff') {
				super.vb = -1;
			}
			
			super.jb = class_og.readShort(101);
			if (~super.jb == -65536) {
				super.jb = -1;
			}
			
			super.tb = class_og.readShort(44);
			if (~super.tb == -65536) {
				super.tb = -1;
			}
			
			//noinspection ConstantConditions
			this.Ic = ug.a(class_og.readLong(516491232), 0).a(83);
			System.out.println(this.Ic);
			this.Cc = class_og.readUnsignedByte(255);
			if (!flag) {
				this.qc = 0;
			} else {
				this.qc = class_og.readShort(unused + 25122);
			}
			
			if (this.Ac == null) {
				this.Ac = new hc();
			}
			
			this.Ac.a(colourValues, data, i2, 0, ~i1 == -2);
		} catch (RuntimeException var14) {
			throw bc.a(var14, "dg.M(" + unused + ',' + "{...}" + ')');
		}
	}
}
