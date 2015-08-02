package thebetweenlands.client.model.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * BLTempleGuardian1 - TripleHeadedSheep
 * Created using Tabula 4.1.1
 */
public class ModelMeleeGuardian extends ModelBase {
    public ModelRenderer body_base;
    public ModelRenderer chestpiece_right;
    public ModelRenderer chestpiece_left;
    public ModelRenderer legright_1;
    public ModelRenderer legleft_1;
    public ModelRenderer armouredskirt_back;
    public ModelRenderer armouredskirt_right;
    public ModelRenderer armouredskirt_left;
    public ModelRenderer neck;
    public ModelRenderer shoulder_right;
    public ModelRenderer armright_1;
    public ModelRenderer armright_2;
    public ModelRenderer sword_handle;
    public ModelRenderer pommel1;
    public ModelRenderer pommel2;
    public ModelRenderer guard1;
    public ModelRenderer blade1;
    public ModelRenderer guard2;
    public ModelRenderer guard3;
    public ModelRenderer blade2;
    public ModelRenderer shoulder_left;
    public ModelRenderer armleft_1;
    public ModelRenderer armleft_2;
    public ModelRenderer shield_baseplate;
    public ModelRenderer shieldstrap;
    public ModelRenderer edge1a;
    public ModelRenderer edge2a;
    public ModelRenderer edge3a;
    public ModelRenderer edge4a;
    public ModelRenderer button_huehue_butt;
    public ModelRenderer edge1b;
    public ModelRenderer edge2b;
    public ModelRenderer edge3b;
    public ModelRenderer edge4b;
    public ModelRenderer legright_2;
    public ModelRenderer footpiece_right;
    public ModelRenderer legleft_2;
    public ModelRenderer footpiece_left;
    public ModelRenderer armouredskirt_backedge;
    public ModelRenderer headconnection;
    public ModelRenderer headbase;
    public ModelRenderer facepiece;
    public ModelRenderer nose;
    public ModelRenderer helmettop;
    public ModelRenderer helmetside_right;
    public ModelRenderer helmetside_left;
    public ModelRenderer helmet_back;

    public ModelMeleeGuardian() {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.helmetside_left = new ModelRenderer(this, 125, 56);
        this.helmetside_left.setRotationPoint(3.0F, 0.0F, 0.0F);
        this.helmetside_left.addBox(0.0F, 0.0F, -4.99F, 2, 7, 10, 0.0F);
        this.setRotateAngle(helmetside_left, 0.0F, 0.0F, -0.136659280431156F);
        this.shieldstrap = new ModelRenderer(this, 39, 101);
        this.shieldstrap.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.shieldstrap.addBox(-2.5F, 0.0F, -2.5F, 6, 2, 5, 0.0F);
        this.setRotateAngle(shieldstrap, -0.091106186954104F, 0.0F, 0.0F);
        this.guard1 = new ModelRenderer(this, 0, 78);
        this.guard1.setRotationPoint(0.0F, -3.0F, 1.5F);
        this.guard1.addBox(-1.5F, -1.5F, -2.5F, 3, 2, 4, 0.0F);
        this.armleft_1 = new ModelRenderer(this, 27, 45);
        this.armleft_1.setRotationPoint(1.5F, 4.5F, 0.5F);
        this.armleft_1.addBox(-1.5F, -1.0F, -2.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(armleft_1, 0.0F, 0.136659280431156F, 0.0F);
        this.headconnection = new ModelRenderer(this, 100, 8);
        this.headconnection.setRotationPoint(0.0F, -3.0F, -1.0F);
        this.headconnection.addBox(-4.0F, 0.0F, -2.0F, 8, 2, 6, 0.0F);
        this.setRotateAngle(headconnection, -0.091106186954104F, 0.0F, 0.0F);
        this.edge3a = new ModelRenderer(this, 27, 97);
        this.edge3a.setRotationPoint(0.0F, 5.0F, -2.0F);
        this.edge3a.addBox(-4.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F);
        this.setRotateAngle(edge3a, 0.091106186954104F, 0.0F, 0.0F);
        this.footpiece_left = new ModelRenderer(this, 80, 28);
        this.footpiece_left.setRotationPoint(0.0F, 8.0F, -2.0F);
        this.footpiece_left.addBox(-1.99F, 0.0F, -3.0F, 4, 2, 3, 0.0F);
        this.setRotateAngle(footpiece_left, 0.18203784098300857F, 0.0F, 0.0F);
        this.edge1b = new ModelRenderer(this, 48, 82);
        this.edge1b.setRotationPoint(0.0F, -1.0F, 0.0F);
        this.edge1b.addBox(-2.0F, -1.0F, 0.0F, 4, 1, 2, 0.0F);
        this.button_huehue_butt = new ModelRenderer(this, 27, 101);
        this.button_huehue_butt.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.button_huehue_butt.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 1, 0.0F);
        this.facepiece = new ModelRenderer(this, 100, 32);
        this.facepiece.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.facepiece.addBox(-3.0F, 0.0F, -2.0F, 6, 2, 2, 0.0F);
        this.edge4a = new ModelRenderer(this, 41, 86);
        this.edge4a.setRotationPoint(5.0F, 0.0F, -2.0F);
        this.edge4a.addBox(0.0F, -4.0F, 0.0F, 1, 8, 2, 0.0F);
        this.setRotateAngle(edge4a, 0.0F, -0.091106186954104F, 0.0F);
        this.footpiece_right = new ModelRenderer(this, 60, 28);
        this.footpiece_right.setRotationPoint(0.0F, 8.0F, -2.0F);
        this.footpiece_right.addBox(-2.01F, 0.0F, -3.0F, 4, 2, 3, 0.0F);
        this.setRotateAngle(footpiece_right, 0.18203784098300857F, 0.0F, 0.0F);
        this.chestpiece_right = new ModelRenderer(this, 0, 18);
        this.chestpiece_right.setRotationPoint(0.0F, -2.0F, -4.0F);
        this.chestpiece_right.addBox(-5.0F, -6.0F, 0.0F, 5, 6, 8, 0.0F);
        this.setRotateAngle(chestpiece_right, -0.045553093477052F, 0.091106186954104F, 0.0F);
        this.nose = new ModelRenderer(this, 100, 37);
        this.nose.setRotationPoint(0.0F, -0.5F, -3.0F);
        this.nose.addBox(-1.0F, -4.0F, -1.0F, 2, 4, 1, 0.0F);
        this.setRotateAngle(nose, -0.136659280431156F, 0.0F, 0.0F);
        this.shoulder_right = new ModelRenderer(this, 0, 33);
        this.shoulder_right.setRotationPoint(-5.0F, -5.0F, 4.0F);
        this.shoulder_right.addBox(-3.5F, -1.5F, -3.0F, 4, 6, 5, 0.0F);
        this.setRotateAngle(shoulder_right, 0.18203784098300857F, 0.091106186954104F, 0.136659280431156F);
        this.legright_2 = new ModelRenderer(this, 60, 13);
        this.legright_2.setRotationPoint(0.0F, 7.1F, 0.0F);
        this.legright_2.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 4, 0.0F);
        this.setRotateAngle(legright_2, 0.0F, 0.0F, -0.045553093477052F);
        this.sword_handle = new ModelRenderer(this, 0, 68);
        this.sword_handle.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.sword_handle.addBox(-1.0F, -3.0F, 0.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(sword_handle, 1.6390387005478748F, 0.0F, 0.0F);
        this.guard3 = new ModelRenderer(this, 11, 86);
        this.guard3.setRotationPoint(0.0F, 0.5F, -2.5F);
        this.guard3.addBox(-1.49F, -2.0F, -2.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(guard3, -0.27314402793711257F, 0.0F, 0.0F);
        this.helmettop = new ModelRenderer(this, 100, 43);
        this.helmettop.setRotationPoint(0.0F, -6.0F, 1.0F);
        this.helmettop.addBox(-5.0F, -2.0F, -5.0F, 10, 2, 10, 0.0F);
        this.pommel1 = new ModelRenderer(this, 9, 68);
        this.pommel1.setRotationPoint(0.0F, 2.5F, 0.5F);
        this.pommel1.addBox(-1.5F, 0.0F, 0.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(pommel1, 0.091106186954104F, 0.0F, 0.0F);
        this.shield_baseplate = new ModelRenderer(this, 27, 68);
        this.shield_baseplate.setRotationPoint(2.0F, 3.0F, -1.0F);
        this.shield_baseplate.addBox(-5.0F, -5.0F, -2.0F, 10, 10, 2, 0.0F);
        this.setRotateAngle(shield_baseplate, 0.091106186954104F, -1.3203415791337103F, 0.0F);
        this.helmetside_right = new ModelRenderer(this, 100, 56);
        this.helmetside_right.setRotationPoint(-3.0F, 0.0F, 0.0F);
        this.helmetside_right.addBox(-2.0F, 0.0F, -4.99F, 2, 7, 10, 0.0F);
        this.setRotateAngle(helmetside_right, 0.0F, 0.0F, 0.136659280431156F);
        this.edge2a = new ModelRenderer(this, 27, 86);
        this.edge2a.setRotationPoint(-5.0F, 0.0F, -2.0F);
        this.edge2a.addBox(-1.0F, -4.0F, 0.0F, 1, 8, 2, 0.0F);
        this.setRotateAngle(edge2a, 0.0F, 0.091106186954104F, 0.0F);
        this.guard2 = new ModelRenderer(this, 0, 86);
        this.guard2.setRotationPoint(0.0F, 0.5F, 1.5F);
        this.guard2.addBox(-1.51F, -2.0F, 0.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(guard2, 0.27314402793711257F, 0.0F, 0.0F);
        this.armouredskirt_backedge = new ModelRenderer(this, 60, 42);
        this.armouredskirt_backedge.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.armouredskirt_backedge.addBox(-3.0F, 0.0F, -2.0F, 6, 1, 2, 0.0F);
        this.edge4b = new ModelRenderer(this, 48, 86);
        this.edge4b.setRotationPoint(1.0F, 0.0F, 0.0F);
        this.edge4b.addBox(0.0F, -2.0F, 0.0F, 1, 4, 2, 0.0F);
        this.armouredskirt_left = new ModelRenderer(this, 77, 46);
        this.armouredskirt_left.setRotationPoint(2.0F, 6.0F, 0.0F);
        this.armouredskirt_left.addBox(0.0F, 0.0F, -3.0F, 2, 5, 6, 0.0F);
        this.setRotateAngle(armouredskirt_left, 0.0F, 0.0F, -0.18203784098300857F);
        this.legleft_1 = new ModelRenderer(this, 80, 0);
        this.legleft_1.setRotationPoint(2.0F, 6.0F, 0.0F);
        this.legleft_1.addBox(-1.5F, -1.0F, -1.5F, 3, 9, 3, 0.0F);
        this.setRotateAngle(legleft_1, 0.0F, -0.091106186954104F, -0.045553093477052F);
        this.armouredskirt_right = new ModelRenderer(this, 60, 46);
        this.armouredskirt_right.setRotationPoint(-2.0F, 6.0F, 0.0F);
        this.armouredskirt_right.addBox(-2.0F, 0.0F, -3.0F, 2, 5, 6, 0.0F);
        this.setRotateAngle(armouredskirt_right, 0.0F, 0.0F, 0.18203784098300857F);
        this.blade1 = new ModelRenderer(this, 0, 91);
        this.blade1.setRotationPoint(0.0F, -4.0F, 1.0F);
        this.blade1.addBox(-0.5F, -16.0F, -1.5F, 1, 16, 3, 0.0F);
        this.armleft_2 = new ModelRenderer(this, 27, 54);
        this.armleft_2.setRotationPoint(0.0F, 4.0F, -1.0F);
        this.armleft_2.addBox(-2.0F, -1.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(armleft_2, -0.31869712141416456F, 0.045553093477052F, 0.0F);
        this.neck = new ModelRenderer(this, 100, 0);
        this.neck.setRotationPoint(0.0F, -8.0F, 0.0F);
        this.neck.addBox(-2.0F, -2.0F, -2.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(neck, 0.045553093477052F, 0.0F, 0.0F);
        this.pommel2 = new ModelRenderer(this, 9, 73);
        this.pommel2.setRotationPoint(0.0F, 2.5F, 0.5F);
        this.pommel2.addBox(-1.51F, 0.0F, -2.0F, 3, 2, 2, 0.0F);
        this.setRotateAngle(pommel2, 0.27314402793711257F, 0.0F, 0.0F);
        this.edge1a = new ModelRenderer(this, 27, 82);
        this.edge1a.setRotationPoint(0.0F, -5.0F, -2.0F);
        this.edge1a.addBox(-4.0F, -1.0F, 0.0F, 8, 1, 2, 0.0F);
        this.setRotateAngle(edge1a, -0.091106186954104F, 0.0F, 0.0F);
        this.legleft_2 = new ModelRenderer(this, 80, 13);
        this.legleft_2.setRotationPoint(0.0F, 7.1F, 0.0F);
        this.legleft_2.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 4, 0.0F);
        this.setRotateAngle(legleft_2, 0.0F, 0.0F, 0.045553093477052F);
        this.armright_1 = new ModelRenderer(this, 0, 45);
        this.armright_1.setRotationPoint(-1.5F, 4.5F, 0.5F);
        this.armright_1.addBox(-1.5F, -1.0F, -2.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(armright_1, 0.0F, -0.136659280431156F, 0.0F);
        this.armouredskirt_back = new ModelRenderer(this, 60, 34);
        this.armouredskirt_back.setRotationPoint(0.0F, 6.0F, 3.0F);
        this.armouredskirt_back.addBox(-4.0F, 0.0F, -2.0F, 8, 5, 2, 0.0F);
        this.setRotateAngle(armouredskirt_back, 0.18203784098300857F, 0.0F, 0.0F);
        this.body_base = new ModelRenderer(this, 0, 0);
        this.body_base.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.body_base.addBox(-4.0F, -2.0F, -3.0F, 8, 8, 6, 0.0F);
        this.armright_2 = new ModelRenderer(this, 0, 54);
        this.armright_2.setRotationPoint(0.0F, 4.0F, -1.0F);
        this.armright_2.addBox(-2.0F, -1.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(armright_2, -0.31869712141416456F, -0.045553093477052F, 0.0F);
        this.blade2 = new ModelRenderer(this, 9, 91);
        this.blade2.setRotationPoint(0.0F, -16.0F, 0.0F);
        this.blade2.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 2, 0.0F);
        this.helmet_back = new ModelRenderer(this, 100, 74);
        this.helmet_back.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.helmet_back.addBox(-5.01F, 0.0F, 0.0F, 10, 8, 2, 0.0F);
        this.setRotateAngle(helmet_back, 0.18203784098300857F, 0.0F, 0.0F);
        this.headbase = new ModelRenderer(this, 100, 17);
        this.headbase.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.headbase.addBox(-4.0F, -6.0F, -3.0F, 8, 6, 8, 0.0F);
        this.edge2b = new ModelRenderer(this, 34, 86);
        this.edge2b.setRotationPoint(-1.0F, 0.0F, 0.0F);
        this.edge2b.addBox(-1.0F, -2.0F, 0.0F, 1, 4, 2, 0.0F);
        this.edge3b = new ModelRenderer(this, 48, 97);
        this.edge3b.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.edge3b.addBox(-2.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F);
        this.legright_1 = new ModelRenderer(this, 60, 0);
        this.legright_1.setRotationPoint(-2.0F, 6.0F, 0.0F);
        this.legright_1.addBox(-1.5F, -1.0F, -1.5F, 3, 9, 3, 0.0F);
        this.setRotateAngle(legright_1, 0.0F, 0.091106186954104F, 0.045553093477052F);
        this.chestpiece_left = new ModelRenderer(this, 27, 18);
        this.chestpiece_left.setRotationPoint(0.0F, -2.0F, -4.0F);
        this.chestpiece_left.addBox(0.0F, -6.0F, 0.0F, 5, 6, 8, 0.0F);
        this.setRotateAngle(chestpiece_left, -0.045553093477052F, -0.091106186954104F, 0.0F);
        this.shoulder_left = new ModelRenderer(this, 27, 33);
        this.shoulder_left.setRotationPoint(5.0F, -5.0F, 4.0F);
        this.shoulder_left.addBox(-0.5F, -1.5F, -3.0F, 4, 6, 5, 0.0F);
        this.setRotateAngle(shoulder_left, 0.18203784098300857F, -0.091106186954104F, -0.136659280431156F);
        this.helmettop.addChild(this.helmetside_left);
        this.armleft_2.addChild(this.shieldstrap);
        this.sword_handle.addChild(this.guard1);
        this.shoulder_left.addChild(this.armleft_1);
        this.neck.addChild(this.headconnection);
        this.shield_baseplate.addChild(this.edge3a);
        this.legleft_2.addChild(this.footpiece_left);
        this.edge1a.addChild(this.edge1b);
        this.shield_baseplate.addChild(this.button_huehue_butt);
        this.headbase.addChild(this.facepiece);
        this.shield_baseplate.addChild(this.edge4a);
        this.legright_2.addChild(this.footpiece_right);
        this.body_base.addChild(this.chestpiece_right);
        this.headbase.addChild(this.nose);
        this.chestpiece_right.addChild(this.shoulder_right);
        this.legright_1.addChild(this.legright_2);
        this.armright_2.addChild(this.sword_handle);
        this.guard1.addChild(this.guard3);
        this.headbase.addChild(this.helmettop);
        this.sword_handle.addChild(this.pommel1);
        this.armleft_2.addChild(this.shield_baseplate);
        this.helmettop.addChild(this.helmetside_right);
        this.shield_baseplate.addChild(this.edge2a);
        this.guard1.addChild(this.guard2);
        this.armouredskirt_back.addChild(this.armouredskirt_backedge);
        this.edge4a.addChild(this.edge4b);
        this.body_base.addChild(this.armouredskirt_left);
        this.body_base.addChild(this.legleft_1);
        this.body_base.addChild(this.armouredskirt_right);
        this.sword_handle.addChild(this.blade1);
        this.armleft_1.addChild(this.armleft_2);
        this.body_base.addChild(this.neck);
        this.sword_handle.addChild(this.pommel2);
        this.shield_baseplate.addChild(this.edge1a);
        this.legleft_1.addChild(this.legleft_2);
        this.shoulder_right.addChild(this.armright_1);
        this.body_base.addChild(this.armouredskirt_back);
        this.armright_1.addChild(this.armright_2);
        this.blade1.addChild(this.blade2);
        this.helmettop.addChild(this.helmet_back);
        this.headconnection.addChild(this.headbase);
        this.edge2a.addChild(this.edge2b);
        this.edge3a.addChild(this.edge3b);
        this.body_base.addChild(this.legright_1);
        this.body_base.addChild(this.chestpiece_left);
        this.chestpiece_left.addChild(this.shoulder_left);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.body_base.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
