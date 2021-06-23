# sample-portal-api
  In this api contain 4 category, such as Education, Health, Government Budget & Expenditure and Politics & Governance.
  
## Education Category
* ข้อมูลพื้นฐานสถาบันอุดมศึกษาปีการศึกษา 2563 <br />
  https://sample-portal-api.herokuapp.com/v1/education/university

* รายชื่อโรงเรียนสาธิตในสถาบันอุดมศึกษา <br />
  https://sample-portal-api.herokuapp.com/v1/education/demonstration

* จำนวนนักเรียนในโรงเรียนสาธิต ปีการศึกษา 2563 จำแนกตามชื่อโรงเรียนและเพศ <br />
  https://sample-portal-api.herokuapp.com/v1/education/demonstration/numandsex

## Health Category \*
* ข้อมูลเกี่ยวกับ Covid-19 รายวัน <br />
  https://sample-portal-api.herokuapp.com/v1/health/covid-19/daily

* ข้อมูลเกี่ยวกับ Covid-19 สรุปตาม timeline <br />
  https://sample-portal-api.herokuapp.com/v1/health/covid-19/timeline

* ข้อมูลเกี่ยวกับ Covid-19 แยกตามเคส <br />
  https://sample-portal-api.herokuapp.com/v1/health/covid-19/bycase

Note :
\* มีปัญหาเรื่องชนิดข้อมูลที่ส่งเข้ามา ถ้าเป็น local จะได้ json แต่พออยู่บน heroku จะได้เป็น text plain

## Goverment Budget & Expenditure
* รายชื่อหน่วยงานระดับกระทรวง <br />
  https://sample-portal-api.herokuapp.com/v1/governBudget/ministry

* ข้อมูลโครงการจัดซื้อจัดจ้าง <br />
  https://sample-portal-api.herokuapp.com/v1/governBudget/procurementproject

* ข้อมูลงบประมาณและการเบิกจ่าย ปี 2563 <br />
  https://sample-portal-api.herokuapp.com/v1/governBudget/disbursement2563

* ข้อมูลรายชื่อจังหวัด <br />
  https://sample-portal-api.herokuapp.com/v1/governBudget/province

* ข้อมูลรายชื่อหน่วยงานระดับกรม <br />
  https://sample-portal-api.herokuapp.com/v1/governBudget/department

* ข้อมูลนิติบุคคล บริษัท ซิโนสยาม จำกัด <br />
  https://sample-portal-api.herokuapp.com/v1/governBudget/juristic

## Politics & Governance
* ข้อมูลสถานที่ตั้งของสำนักงานท้องถิ่นจังหวัด <br />
  https://sample-portal-api.herokuapp.com/v1/politics/localoffice/location

* ข้อมูลสถานที่ตั้งของสำนักงานองค์กรปกครองส่วนท้องถิ่น <br />
  https://sample-portal-api.herokuapp.com/v1/politics/organizationoffice/location

* ข้อมูลเว็บไซต์องค์กรปกครองส่วนท้องถิ่น <br />
  https://sample-portal-api.herokuapp.com/v1/politics/organizationoffice/website

* รหัส อปท. ตามมาตรฐานเขตการปกครองของไทยรายจังหวัด <br />
  https://sample-portal-api.herokuapp.com/v1/politics/organizationoffice/code
