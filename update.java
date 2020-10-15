 int ok=JOptionPane.showConfirmDialog(null,"Apakah Yakin Untuk Update Record ini???","Confirmation",JOptionPane.YES_NO_OPTION);
         try
            {
                String sql="update identitas set NoBP=?,Nama_MHS=?,J_Kelamin=?,Alamat=?,Jurusan=?,NoHp=? where NoBP='"+TxtNobp.getText()+"'";
                PreparedStatement st=con.prepareStatement(sql);
                if(ok==0)
                {
                try
                    {
                        st.setString(1,TxtNobp.getText());
                        st.setString(2,TxtNama.getText());
                        st.setString(3,TxtJk.getText());
                        st.setString(4,TxtAlamat.getText());
                        st.setString(5,TxtJurusan.getText());
                        st.setString(6,TxtNohp.getText());
                        st.executeUpdate();

                        JOptionPane.showMessageDialog(null,"Update Data Sukses");
                    }catch (Exception e)
                    {
                        JOptionPane.showMessageDialog(null, "Update Data Gagal");
                    }
                }
           }catch (Exception e){}
