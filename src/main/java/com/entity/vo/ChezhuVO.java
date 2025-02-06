package com.entity.vo;

import com.entity.ChezhuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 车主
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-03-22
 */
@TableName("chezhu")
public class ChezhuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 姓名
     */

    @TableField(value = "chezhu_name")
    private String chezhuName;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 身份证号
     */

    @TableField(value = "chezhu_id_number")
    private String chezhuIdNumber;


    /**
     * 手机号
     */

    @TableField(value = "chezhu_phone")
    private String chezhuPhone;


    /**
     * 车牌号
     */

    @TableField(value = "chezhu_chepai_number")
    private String chezhuChepaiNumber;


    /**
     * 照片
     */

    @TableField(value = "chezhu_photo")
    private String chezhuPhoto;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：姓名
	 */
    public String getChezhuName() {
        return chezhuName;
    }


    /**
	 * 获取：姓名
	 */

    public void setChezhuName(String chezhuName) {
        this.chezhuName = chezhuName;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：身份证号
	 */
    public String getChezhuIdNumber() {
        return chezhuIdNumber;
    }


    /**
	 * 获取：身份证号
	 */

    public void setChezhuIdNumber(String chezhuIdNumber) {
        this.chezhuIdNumber = chezhuIdNumber;
    }
    /**
	 * 设置：手机号
	 */
    public String getChezhuPhone() {
        return chezhuPhone;
    }


    /**
	 * 获取：手机号
	 */

    public void setChezhuPhone(String chezhuPhone) {
        this.chezhuPhone = chezhuPhone;
    }
    /**
	 * 设置：车牌号
	 */
    public String getChezhuChepaiNumber() {
        return chezhuChepaiNumber;
    }


    /**
	 * 获取：车牌号
	 */

    public void setChezhuChepaiNumber(String chezhuChepaiNumber) {
        this.chezhuChepaiNumber = chezhuChepaiNumber;
    }
    /**
	 * 设置：照片
	 */
    public String getChezhuPhoto() {
        return chezhuPhoto;
    }


    /**
	 * 获取：照片
	 */

    public void setChezhuPhoto(String chezhuPhoto) {
        this.chezhuPhoto = chezhuPhoto;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
